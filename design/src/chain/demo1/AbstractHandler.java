package chain.demo1;

/**
 * 抽象的任务处理器
 */
public abstract class AbstractHandler {

    //定义下一个任务处理者
    private AbstractHandler handler;

    public AbstractHandler getHandler() {
        return handler;
    }

    public void setHandler(AbstractHandler handler) {
        this.handler = handler;
    }

    /**
     * 抽象的任务处理行为
     */
    public abstract void execute(int money);
}
