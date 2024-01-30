package javaplus.thread;

public class AutoSaveThread extends Thread{

    public void save() {
        System.out.println("작업 내용을 저장함.");
    }

    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                break;
            }
            save();
        }
    }
}
class DaemonExample{
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true); //AutoSaveThread를 데몬 스레드로 만든다.
        autoSaveThread.start();

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("메인 스레드 종료");
    }

}