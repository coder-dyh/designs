package demo1;

public abstract class Teacher {

    private String name;
    private int age;

    /**
     * 所有老师共性的行为
     */
    protected void calling(){
        System.out.println("上课点名");
    }

    /**
     * 抽象的上课行为，由具体的子类去实现不同的细节
     */
    public abstract void teach();

}
