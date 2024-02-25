package javaplus.abstractclass.ex02;


// 추상 클래스의 객체 생성 방법 #2 (익명 이너클래스를 이용하여 객체 생성)
public class AbsractClass_2 {
    public static void main(String[] args) {


        //1. 객체 생성
        A a1 = new A() {
            void abc(){
                System.out.println("방법2. 익명 이너클래스 방법으로 객체 생성");
            }
        };
        A a2 = new A(){
            void abc() {
                System.out.println("방법2. 익명 이너클래스 방법으로 객체 생성");

            }
        };
        a1.abc();
        a2.abc();
    }
}
abstract class A{
    abstract void abc();
}