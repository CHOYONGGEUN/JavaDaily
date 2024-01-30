package javaplus.thread;

public class ThreadWait {
    public static void main(String[] args) {
        Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock){
                try{
                    System.out.println("기다리는 중");
                    lock.wait(); //다른 스레드에 의해 notify() 호출될 떄까지 일시 정지
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Thread1 has been notified");
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lock){
                try{
                    System.out.println("기다리는 중");
                    lock.wait(); //다른 스레드에 의해 notify() 호출될 떄까지 일시 정지
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Thread2 has been notified");
                lock.notify();
                // lock 객체에 대한 wait() 메서드가 일시 정지 상태에서 깨어나도록 함
            }
        });

        t1.start();
        t2.start();

    }
}
