package observer.demo1;

public class ObserverA implements Observer {

    @Override
    public void update(String state) {
        System.out.println("ObserverA接收到指令"+state+", 立即做出相应的业务逻辑处理");
    }
}
