package javaplus.thread;

public class ThreadEx1_1 extends Thread {
        public void run () {
            for (int i = 0; i < 5; i++) {
                //조상인 Thread의 getName()을 호출
                System.out.println(getName());
            }
        }

}
