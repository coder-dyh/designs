package strategy;

/**
 * 策略上下文
 */
public class CalContext {

    private Calculator cal;

    public CalContext(String name){
        if("add".equals(name)){
            cal = new Add();
        }else if("sub".equals(name)){
            cal = new Sub();
        }
    }

    /**
     * 策略模式中还封装了目标对象的调用过程
     */
    public void execute(int numA, int numB){
        cal.cal(numA, numB);
    }
}
