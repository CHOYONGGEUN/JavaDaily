package javaplus.interface_.ex06;

public class DefaultMethod_1 {
    //1. 객체 생성
    public static void main(String[] args) {
        A a1 = new B();
        A a2 = new C();
        a1.abc(); // B 클래스의 abc()
        a1.bcd(); // A 인터페이스의 bcd()

        a2.abc(); // C 클래스의 abc()
        a2.bcd(); // C 클래스의 bcd()

    }

}
interface A{
    void abc(); // 2020년 생성
    default void bcd(){
        System.out.println("A 인터페이스의 bcd()");
    } // 2030년 생성
}
class B implements A{ //2020년 생성
    @Override
    public void abc() {
        System.out.println("B 클래스의 abc()");

    }
}
class C implements A{
    @Override
    public void abc() {
        System.out.println("C 클래스의 abc()");
    }

    @Override
    public void bcd() {
        System.out.println("C 클래스의 bcd()");
    }
}