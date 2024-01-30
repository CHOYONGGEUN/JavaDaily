package javaplus.thread;

public class ThreadEx1_2 implements Runnable {
    public void run(){
        for(int i =0; i <5; i++){
            //Thread.currentThread() - 현재 실행중인 Thread를 반환
            System.out.println(Thread.currentThread().getName());
        }
    }
}
