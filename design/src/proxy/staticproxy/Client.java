package proxy.staticproxy;

public class Client {

    public static void main(String[] args) {

        Producer p = new ProducerProxy(new Lennovo());
        p.payment(5000);
    }
}
