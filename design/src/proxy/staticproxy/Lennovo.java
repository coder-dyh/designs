package proxy.staticproxy;

public class Lennovo extends Producer{

    @Override
    public void payment(int money) {
        System.out.println("联想厂家实收："+money);
    }
}
