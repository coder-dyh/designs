package proxy.connpool;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, InterruptedException {
        ConnectionPool pool = new ConnectionPool(5);
        while(true){
            System.out.println("连接池当前连接数: "+pool.size());
            Connection conn1 = pool.getConnection();
            Connection conn2 = pool.getConnection();
            Connection conn3 = pool.getConnection();
            Connection conn4 = pool.getConnection();
            Connection conn5 = pool.getConnection();
            System.out.println("连接池当前连接数: "+pool.size());
            conn1.close();
            conn2.close();
            conn3.close();
            conn4.close();
            conn5.close();
            System.out.println("连接池当前连接数: "+pool.size());
            Thread.sleep(500);
        }

    }
}
