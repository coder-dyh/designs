package proxy.connpool;

import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.util.LinkedList;

public class ConnectionPool {
    private int poolSize;

    //定义一个集合充当池对象
    private LinkedList<Connection> pool = new LinkedList<>();

    //在构造方法中进行连接池的初始化
    public ConnectionPool(int poolSize) {
        this.poolSize = poolSize;
        init();
    }

    /**
     * 初始化
     */
    private void init() {
        for (int i = 0; i < poolSize; i++) {
            //获取连接
            Connection conn = DBUtil.getConnection();
            //将连接放入连接池中,前提是将连接先进行代理
            pool.add(createProxy(conn));
        }
    }

    /**
     * 给连接创建代理
     */
    private Connection createProxy(Connection conn) {
        //创建代理
        return (Connection) Proxy.newProxyInstance(ConnectionPool.class.getClassLoader(), new Class<?>[]{Connection.class},
                (proxy, method, args) -> {
                    Object ret = null;
                    if ("close".equals(method.getName())) {
                        //将代理放回池中
                        pool.addLast((Connection)proxy);
                    } else {
                        ret = method.invoke(conn, args);
                    }
                    return ret;
                });
    }

    /**
     * 从池中获取连接
     */
    public Connection getConnection() {
        if (pool.size() == 0) {
            throw new RuntimeException("已无连接可用.");
        }
        return pool.removeFirst();
    }

    /**
     * 池大小
     */
    public int size() {
        return pool.size();
    }
}
