package observer.demo1;

/**
 * 抽象的观察者，观察者可以有多个，同时去关注一个主题
 * 这是多对一的关系
 */
public interface Observer {
    void update(String state);
}
