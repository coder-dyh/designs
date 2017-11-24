package strategy;

public class Sub implements Calculator {

    @Override
    public void cal(int numA, int numB) {
        System.out.println(numA - numB);
    }
}
