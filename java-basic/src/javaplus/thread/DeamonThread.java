package javaplus.thread;


/*데몬스레드는 주 스레드의 작업을 봅는 보저적인 역할을 수행하는 수행하는
* 스레드이다.
* 이에 대한 이유는 주 스레드의 보조 역할을 하므로, 존재 의미가 없어지기 떄문이다.
* */
public class DeamonThread {
    public static void main(String[] args) {
//        AutoSavedThread thread = new AutoSavedTherad);
//        thread.setDaemon(true);
//        thread.start();
    }

}
/*스레드를 데몬으로 만들기 위해서는
* 주 스레드가 데몬이 될 스레드의 setDaaemon*(true)를 호출해 준다.*/

/*주의할 점!
* 스레드를 실행하는 start() 메서드가 호출되고 나서 setDaemon(ture)를 호출하면
* 예외가 발생하기 떄문에 start() 메서드 호출 전에 setDaemon(true)를 호출해야 한다.
*
* 현재 실행 중인 스레가 데몬 스레드인지 아닌지 구별하는 방법:
* is Daemon() 메서드의 리턴값을 조사 - 데몬 스레드일 경우 true를 리턴*/