package javaplus.abstractclass.ex01;

//추상 클래스의 객체 생성 방법 #1 (자식 클래스 생성 + 자식 클래스 생성자를 가지고 객체 생성)

public class AbstractClass_1 {
    public static void main(String[] args) {
        // 1. 객체 생성
//        A a1 = new A();
        B b1 = new B();//"방법 #1: 자식클래스 생성 및 추상메서드 구현"
        B b2 = new B();//"방법 #1: 자식클래스 생성 및 추상메서드 구현"

        //2.메서드 호출
        b1.abc();
        b2.abc();
    }

}
abstract class A{
    abstract void abc();
}

class B extends A{
    @Override
    void abc() {
        System.out.println("방법 #1: 자식클래스 생성 및 추상메서드 구현");
    }
}
