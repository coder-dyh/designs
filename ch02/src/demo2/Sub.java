package demo2;

public class Sub implements Calculator {
    @Override
    public void account() {
        System.out.println("减法计算");
    }

    public void display(){
        System.out.println("显示运算结果");
    }
}
