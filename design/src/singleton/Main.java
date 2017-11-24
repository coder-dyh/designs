package singleton;

public class Main {

    public static void main(String[] args) {
        A a = A.getInstance();
        A a1 = A.getInstance();
        System.out.println(a);
        System.out.println(a1);
    }
}
