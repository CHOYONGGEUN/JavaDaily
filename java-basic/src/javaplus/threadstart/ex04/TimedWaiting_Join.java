package javaplus.threadstart.ex04;


class MyThread1 extends Thread {
    @Override
    public void run() {
        // 작업 시간을 늘리기 위해 반복 횟수 증가
        for(long i = 0; i < 10000000000L; i++) {} // 더 긴 시간 동안 작업을 수행
    }
}

class MyThread2 extends Thread {
    MyThread1 myThread1;
    public MyThread2(MyThread1 myThread1) {
        this.myThread1 = myThread1;
    }
    @Override
    public void run() {
        try {
            myThread1.join(3000); // MyThread1의 완료를 최대 3초까지 기다린다
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class TimedWaiting_Join {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2(myThread1);
        myThread1.start();
        myThread2.start();

        try {
            Thread.sleep(100); // 스레드 시작 준비 시간
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 스레드 상태 출력
        System.out.println("MyThread1 State = " + myThread1.getState());
        System.out.println("MyThread2 State = " + myThread2.getState());
    }
}

