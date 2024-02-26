package javaplus.userexception.ex02;

public class ExceptionMethod_1 {


    public static void main(String[] args) {
        //#1. 예외 객체 생성 시 메시지 전달하지 않는 경우
        try{
            throw new Exception();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        //#2. 예외 객체 생성 시 메시지 전달하는 경우
        try{
            throw new Exception("예외메세지");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
