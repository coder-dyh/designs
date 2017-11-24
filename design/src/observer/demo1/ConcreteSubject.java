package observer.demo1;

public class ConcreteSubject extends Subject {

    private String state;

    public String getState() {
        return state;
    }

    public void change(String state){
        this.state = state;
        //调用继承的通知方法来通知所有的观察者
        notifyObservers(state);
    }
}
