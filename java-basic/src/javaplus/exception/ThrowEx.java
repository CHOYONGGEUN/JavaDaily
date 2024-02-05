package javaplus.exception;

public class ThrowEx {
    public static void main(String[] args) {
        ThrowEx ex = new ThrowEx();
        ex.throwException(11);

    }
    public void throwException(int number){
        try{
            if(number>10){
                throw new Exception("숫자가 10보다 큽니다.");
            }
            System.out.println("입력 숫자: " + number);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
