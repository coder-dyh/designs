package singleton;

/**
 *  懒汉式
 */
public class B {

    private static B b;

    private B(){
    }

    /**
     * 懒汉式会存在线程安全的隐患，因此在方法上加入同步锁
     * @return
     */
    public synchronized static B getInstance(){
        if(b == null){
            b = new B();
        }
        return b;
    }

}
