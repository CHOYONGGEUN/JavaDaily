package javaplus.thread;

public class ThreadEx3 extends Thread {

    public void run(){
        //인터렙트 됐을 때, 예외처리
        try{
            for(int i = 0; i< 10; i++){
                Thread.sleep(500);
                System.out.println("Thread:"+i);

            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

}
