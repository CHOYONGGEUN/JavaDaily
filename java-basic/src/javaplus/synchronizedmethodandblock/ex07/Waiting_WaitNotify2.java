package javaplus.synchronizedmethodandblock.ex07;

class DataBox{
    boolean isEmpty = true;
    int data;
    synchronized void inputData(int data){
        if(!isEmpty){
            try {
                wait();
            } catch (InterruptedException e) { //Waiting(얼음)
            }
        }
        this.data = data;
        isEmpty = false;
        System.out.println("입력데이터: " + data);
        notify();
    }
    synchronized void outputData(){
        if(isEmpty){
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        isEmpty = true;
        System.out.println("출력데이터: " + data);
        notify();
    }
}

public class Waiting_WaitNotify2 {
    public static void main(String[] args) {
        DataBox dataBox = new DataBox();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for(int i = 0; i<9; i++){
                    dataBox.inputData(i);
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                for(int i = 0; i<9; i++){
                    dataBox.outputData();
                }
            };
        };
        t1.start();
        t2.start();
    }
}
