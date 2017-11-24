package chain.demo1;

public class Main {

    /**
     * 纯的责任链： 只能也必须只有一个任务处理者去处理这个任务
     *            不会出现没有处理者处理的情况，也不会出现有多个处理者处理同一个任务
     *
     * 不纯的责任链：可以有多个任务处理者同时处理一个任务，
     *             那么就表示这个任务是大家一起共享的。或者也可以没有任何处理者去处理它
     *
     * 责任链模式的关键在于每一个任务处理者都必须持有下一个
     * 任务处理者的引用
     * @param args
     */
    public static void main(String[] args) {
        AbstractHandler a = new HandlerA();
        AbstractHandler b = new HandlerB();
        AbstractHandler c = new HandlerC();
        a.setHandler(b);
        b.setHandler(c);
        a.execute(600);
    }
}
