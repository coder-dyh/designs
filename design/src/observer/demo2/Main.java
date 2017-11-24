package observer.demo2;

public class Main {

    public static void main(String[] args) {
        //创建一个按钮
        DemoButton btn = new DemoButton();
        //注册事件监听器
        btn.addListener(new DemoListener() {
            @Override
            public void doSomething(String event) {
                System.out.println("接收到事件："+event);
            }
        });

        //模拟单击事件
        btn.click("click");
    }
}
