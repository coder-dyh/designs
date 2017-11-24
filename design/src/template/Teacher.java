package template;

public abstract class Teacher {

    protected void calling(){
        System.out.println("上课点名");
    }

    protected abstract void lesson();

    protected abstract void homework();

    /**
     * 在父类中定义一个模板方法,这就是设计模式的关键所在
     * 这个模板方法封装了执行步骤的调用细节
     */
    public void work(){
        calling();
        lesson();
        homework();
        hock();
    }

    /**
     * 钩子方法，在父类中的默认行为，但这个方法不一定适用于所有的子类
     * 子类可以根据需要来重写此方法，
     * 钩子方法应该是一个默认的非抽象的方法。
     */
    protected void hock(){
    }
}
