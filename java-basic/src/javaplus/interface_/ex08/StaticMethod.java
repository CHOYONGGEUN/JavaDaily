package javaplus.interface_.ex08;

public class StaticMethod {
    public static void main(String[] args) {
        //1. 정적 메서드 호출
        A.abc();
    }
}
interface  A{
    static void abc(){
        System.out.println("A 인터페이스의 정적 메서드 abc()");
    }
}
