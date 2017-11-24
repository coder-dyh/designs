package observer.demo1;

public class Main {

    public static void main(String[] args) {
        //创建主题
        ConcreteSubject subject = new ConcreteSubject();
        //创建观察者
        Observer a = new ObserverA();
        Observer b = new ObserverB();
        //关注主题
        subject.attach(a);
        subject.attach(b);

        //进行通知
        subject.change("new state");
    }
}
