package strategy;

public class Main {

    public static void main(String[] args) {
        CalContext context = new CalContext("add");
        context.execute(1,2);
    }
}
