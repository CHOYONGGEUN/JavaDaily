package javaplus.thread;

public class ThreadEx5 implements Runnable {

    @Override
    public void run() {
        try{
            for(int i=0; i<10; i++){
                //대기시간 0.2초
                Thread.sleep(200);
                System.out.println("스레드:"+i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
