package demo1;

public class NetTeacher extends Teacher implements Coding {
    @Override
    public void teach() {
        calling();
        System.out.println("上.Net课程");
    }

    @Override
    public void code() {
        System.out.println(".Net开发");
    }
}
