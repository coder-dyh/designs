package demo2;

public class Add implements Calculator{
    @Override
    public void account() {
        System.out.println("加法计算");
    }

    public void display(){
        System.out.println("显示运算结果");
    }
}
