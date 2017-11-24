package a;

class A {

    public void test(){
        toDo();
    }

    protected void run(){
        System.out.println("running...");
    }

    void jump(){
        System.out.println("jump");
    }

    private void toDo(){
        toDo2();
        System.out.println("do something...");
    }

    private void toDo2(){
        System.out.println("check something...");
    }


}
