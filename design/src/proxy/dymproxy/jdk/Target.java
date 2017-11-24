package proxy.dymproxy.jdk;

public class Target implements MyInterface {

    @Override
    public void work() {
        System.out.println("working...");
    }

    @Override
    public void say() {
        System.out.println("Hello world");
    }
}
