package javaplus.threadstart.ex05;



class MyBlockTest{
    //#1. 공유객체
    MyClass mc = new MyClass();

    //#2. 세 개의 쓰레드 필드 생성
    Thread t1 = new Thread("thread1"){
        @Override
        public void run() {
            mc.syncMethod();
        };
    };
    Thread t2 = new Thread("thread2"){
        @Override
        public void run() {
            mc.syncMethod();
        };
    };
    Thread t3 = new Thread("thread3"){
        @Override
        public void run() {
            mc.syncMethod();
        };
    };
    void startAll(){
        t1.start();
        t2.start();
        t3.start();
    }

    class MyClass{
        synchronized void syncMethod(){

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }// 쓰레드 준비시간

            System.out.println("=====" +Thread.currentThread().getName() + "=======");
            System.out.println("thread1->" + t1.getState());
            System.out.println("thread1->" + t2.getState());
            System.out.println("thread1->" + t3.getState());
            for(long i = 0; i < 10000000000L; i++) {} // 더 긴 시간 동안 작업을 수행

        }
    }
}
public class BlockState {
    public static void main(String[] args) {
        MyBlockTest mbt = new MyBlockTest();
        mbt.startAll();

    }
}
