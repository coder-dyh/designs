package demo1;

public class JavaTeacher extends Teacher implements Coding{
    @Override
    public void teach() {
        calling();
        System.out.println("上Java课程");
    }

    @Override
    public void code() {
        System.out.println("Java开发");
    }
}
