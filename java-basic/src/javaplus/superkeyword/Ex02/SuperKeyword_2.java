package javaplus.superkeyword.Ex02;


public class SuperKeyword_2 {
    public static void main(String[] args) {
        //1. 객체 생성
        B bb = new B();

        //2. 메서드 호출
        bb.bcd();
    }

}
class A{
    void abc(){
        System.out.println("A 클래스의 abc()");
    }
}
class B extends A {
    @Override
    void abc(){
        System.out.println("B 클래스의 abc()");
    }
    void bcd(){
        super.abc(); // this.abc() : 부모클래스 객체의 abc(); 호출
    }
}