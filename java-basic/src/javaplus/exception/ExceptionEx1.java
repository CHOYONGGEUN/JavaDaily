package javaplus.exception;

public class ExceptionEx1 {

    public static void generateException(){
        try{
            int result = 10 / 0; // 이 코드는 ArithmeticExceptoin을 발생시킨다.
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException 발견");

            System.out.println("printStackTrace(): ");
            e.printStackTrace();

            //getMessage() 메서드 : 예외 메시지를 반환한다.
            System.out.println("\n getMessage(): ");
            System.out.println(e.getMessage());

            //toString() 메서드 : 예외의 간략한 설명(클래스 이름 + ":" + 메시지)을 반환한다.
            System.out.println("\n toString(): ");
            System.out.println(e.toString());
        }
    }
    public static void main(String[] args) {
        generateException();

    }
}
