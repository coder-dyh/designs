package observer.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象的主题，让有所的观察者来关注
 */
public abstract class Subject {

    //观察者的集合,一个主题对应多个观察者
    private List<Observer> list = new ArrayList<>();

    //添加观察者
    public void attach(Observer observer){
        list.add(observer);
    }

    //移除观察者
    public void detach(Observer observer){
        list.remove(observer);
    }

    /**
     * 通知所有观察者的方法,当主题本身状态发生变化时，会立即通知所有的观察者
     * 观察者会依据这些状态来做出不同的逻辑处理
     */
    protected void notifyObservers(String state){
        for (Observer o : list) {
            o.update(state);
        }
    }


}
