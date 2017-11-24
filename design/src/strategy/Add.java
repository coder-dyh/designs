package strategy;

public class Add implements Calculator {

    @Override
    public void cal(int numA, int numB) {
        System.out.println(numA + numB);
    }
}
