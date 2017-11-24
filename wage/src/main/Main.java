package main;

import model.Emp;
import model.Post;
import service.WagePaymentService;

public class Main {

    public static void main(String[] args) {
        Post cleaner = new Post();
        cleaner.setPostName("cleaner");
        cleaner.setProperty("workHours",8);
        cleaner.setProperty("hourWage",10.0);
        Emp emp1 = new Emp();
        emp1.setName("张三");
        emp1.setPost(cleaner);
        System.out.println(emp1.getName()+" : "+new WagePaymentService(emp1).payment());

        Post clerk = new Post();
        clerk.setPostName("clerk");
        clerk.setProperty("wage",3000.0);
        Emp emp2 = new Emp();
        emp2.setName("李四");
        emp2.setPost(clerk);
        System.out.println(emp2.getName()+" : "+new WagePaymentService(emp2).payment());

        Post sales = new Post();
        sales.setPostName("sales");
        sales.setProperty("wage", 2000.0);
        sales.setProperty("salesVal", 5);
        sales.setProperty("commission", 50.0);
        Emp emp3 = new Emp();
        emp3.setName("王五");
        emp3.setPost(sales);
        System.out.println(emp3.getName()+" : "+new WagePaymentService(emp3).payment());
    }
}
