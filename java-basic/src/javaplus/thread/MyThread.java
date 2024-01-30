package javaplus.thread;

public class MyThread implements Runnable {
    private String string;
    public MyThread(String s) {
        this.string = s;
    }

    @Override
    public void run() {
        System.out.println(string);
    }
}
