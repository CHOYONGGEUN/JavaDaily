package javaplus.throwexception;

public class ThrowsException_1 {
}

//#1. 하위 클래스에 직접 예외를 처리하는 경우
class A{
    void abc(){
        bcd();
    }
    void bcd(){
        try {
            Thread.sleep(1000); //일반 예외
        } catch (InterruptedException e) {

            //예외 처리 구문
        }
    }
}


//#2. 예외를 호출 메서드로 전가하는 경우
class B{
    void abc(){
        try {
            bcd();
        } catch (InterruptedException e) {
            //예외처리 구문
        }
    }
    void bcd() throws InterruptedException{
        Thread.sleep(1000);
    }
}