package demo2;

public class Son extends Father {

    public void say(double d) {
        System.out.println(d);
    }

    @Override
    public void work() {
        System.out.println("son working...");
    }
}
