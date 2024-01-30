package javaplus.thread;

public class ThreadEx4 {
    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest();
        ThreadTest t2 = new ThreadTest();

        t1.run();
        t2.run();
    }
}
