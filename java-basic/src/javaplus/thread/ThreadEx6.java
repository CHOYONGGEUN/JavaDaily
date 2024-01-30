package javaplus.thread;

public class ThreadEx6 {
    public static void main(String[] args) {
        //Runnable 인터페이스 객체생성
        RunnableTest Obj1 = new RunnableTest();
        RunnableTest Obj2 = new RunnableTest();

        //Runnable 객체를 매개변수로 해서 스레드 객체 생성
        Thread th1 = new Thread(String.valueOf(Obj1));
        Thread th2 = new Thread(String.valueOf(Obj2));
    }
}
