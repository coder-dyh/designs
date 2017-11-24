package chain.demo1;

public class HandlerB extends AbstractHandler {

    @Override
    public void execute(int money) {
        if(money <= 500){
            System.out.println("HandlerB审批通过");
        }else{
            //交给下一个人处理
            if(getHandler() != null){
                getHandler().execute(money);
            }
        }
    }
}
