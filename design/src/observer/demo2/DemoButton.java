package observer.demo2;

/**
 * 其实button就是具体的主题对象
 */
public class DemoButton {

    //其实这个监听器就是观察者对象，这里的观察者对象只有一个
    private DemoListener listener;

    //注册监听器，其实就是添加具体的观察者
    public void addListener(DemoListener listener){
        this.listener = listener;
    }

    //单击事件，其实就是具体的通知方法
    public void click(String event){
        listener.doSomething(event);
    }
}
