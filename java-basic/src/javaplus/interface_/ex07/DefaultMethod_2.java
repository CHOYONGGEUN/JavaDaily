package javaplus.interface_.ex07;

public class DefaultMethod_2 {
    public static void main(String[] args) {
        //1. 객체 생성
        A b = new B();
        //2. 메서드 호출
        b.abc(); // B 클래스의 abc()
    }
}

interface A{
    default  void abc(){
        System.out.println("A 인터페이스의 abc()");
    }
}

class B implements A{
    @Override
    public void abc() {
        A.super.abc(); //super.abc() 이거는 부모 클래스(Object)의 abc() 메서드를 호출하라는 소리
        System.out.println("B 클래스의 abc()");
    }
}
