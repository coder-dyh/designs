package demo;

/**
 * 人
 */
public class People implements Fly {

    private String name;

    public People(String name){
        this.name = name;
    }

    public void say(){
        System.out.println("My name is "+name);
    }

    public void fly(){
        System.out.println("I'm a supper man.");
    }
}
