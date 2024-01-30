package javaplus.thread;

public class ThreadYield {
    public static void main(String[] args) {
        Thread t1 = new Thread(()-> {
            for(int i =1; i <=5; i++){
                System.out.println("Thread 1 :" + i);
                Thread.yield(); //다른 스레드에게 실행 기회 양보
            }
        });

        Thread t2 = new Thread(()-> {
            for(int i =1; i <=5; i++){
                System.out.println("Thread 2 :" + i);
                Thread.yield(); //다른 스레드에게 실행 기회 양보
            }
        });

        t1.start();
        t2.start();
    }
}
