package service;

import model.Emp;
import service.impl.CleanerWagePayment;
import service.impl.ClerkWagePayment;
import service.impl.SalesWagePayment;

public class WagePaymentService {


    private Emp emp;

    public WagePaymentService(Emp emp){
        this.emp = emp;
        if("cleaner".equals(emp.getPost().getPostName())){
            emp.getPost().setWagePayment(new CleanerWagePayment());
        }else if("clerk".equals(emp.getPost().getPostName())){
            emp.getPost().setWagePayment(new ClerkWagePayment());
        }else if("sales".equals(emp.getPost().getPostName())){
            emp.getPost().setWagePayment(new SalesWagePayment());
        }
    }

    public double payment(){
        return emp.getPost().payment();
    }
}
