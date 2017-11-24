package demo1;

public class Main {

    public static void main(String[] args) {
        Teacher t = new JavaTeacher();
        t.teach();
        Coding coder = (Coding)t;
        coder.code();

    }
}
