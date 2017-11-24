package template;

public class EngTeacher extends Teacher {

    @Override
    public void lesson() {
        System.out.println("上英语课程");
    }

    @Override
    public void homework() {
        System.out.println("布置英语作业");
    }

    /**
     * 挂钩
     */
    @Override
    public void hock(){
        System.out.println("EngTeacher重写了父类的hock方法");
    }
}
