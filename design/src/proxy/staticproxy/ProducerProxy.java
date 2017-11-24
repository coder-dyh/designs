package proxy.staticproxy;

/**
 * 代理类,负责调用目标对象的功能
 */
public class ProducerProxy extends Producer {

    /**
     * 定义一个target目标对象，也就是被代理的对象
     */
    private Producer producer;

    public ProducerProxy(Producer producer){
        this.producer = producer;
    }

    /**
     * 代理模式的重要的地方就是可以在调用目标对象方法之前
     * 或者之后额外做一些事情,但这些事情对应客户端来说是透明的
     * 客户端根本不知道。同样对于目标对象也是透明的。
     * @param money
     */
    @Override
    public void payment(int money) {
        money = before(money);
        producer.payment(money);
        after();
    }

    /**
     * 在调用目标对象之前执行的方法
     * @param money
     * @return
     */
    private int before(int money){
        System.out.println("收取客户金额："+money+", 利润为："+(money - 2000));
        return money - 3000;
    }

    /**
     * 在调用目标对象之后做的一些事情
     */
    private void after(){
        System.out.println("开发票.");
    }
}
