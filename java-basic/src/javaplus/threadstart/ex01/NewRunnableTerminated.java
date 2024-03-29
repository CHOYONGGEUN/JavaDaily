package javaplus.threadstart.ex01;

import java.lang.Thread.State;

public class NewRunnableTerminated {
    public static void main(String[] args) {
        //#쓰레드 상태 저장 클래스
        State state;
        //#1. 객체 생성(NEW)
        Thread thread = new Thread(){
            @Override
            public void run() {
                for(long i = 0; i<1000000L; i++){} // 시간 지연
            }
        };
        state = thread.getState();
        System.out.println("thread state = " + thread.getState()); //NEW(객체가 만들어진 상태)


        //#2. Thread 시작
        thread.start();
        state = thread.getState();
        System.out.println("thread state =" + state); //Runnable

        //#3. Thread 종료
        try {
            thread.join();
        } catch (InterruptedException e) {
        }

        state = thread.getState();
        System.out.println("thread state =" + state); //Terminated


    }
}
