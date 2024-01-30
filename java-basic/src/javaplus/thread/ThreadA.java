package javaplus.thread;

public class ThreadA extends Thread{
    public ThreadA(){
        this.setName("ThreadA"); //스레드 이름 변경
    }

    @Override
    public void run() {
        for(int i = 0; i <2; i++){
            System.out.println(this.getName() + "가 출력한 내용");
        }
    }
}
class ThreadB extends Thread{


    @Override
    public void run() {
        for(int i = 0; i <2; i++){
            System.out.println(this.getName() + "가 출력한 내용");
        }

    }
}
class Main{
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread(); //현재 수행 스레드 확인
        System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());

        Thread threadA = new ThreadA();
        System.out.println("작업 스레드 이름: " + threadA.getName());//스레드 이름 확인
        threadA.start();

        Thread threadB = new ThreadB();
        System.out.println("작업 스레드 이름: " + threadA.getName());//스레드 이름 확인
        threadB.start();
    }
}
