package chain.demo1;

public class HandlerC extends AbstractHandler {

    @Override
    public void execute(int money) {
        if(money <= 1000){
            System.out.println("HandlerC审批通过");
        }else{
            System.out.println("超出预算.");
        }
    }
}
