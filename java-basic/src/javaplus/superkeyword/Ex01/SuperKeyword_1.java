package javaplus.superkeyword.Ex01;

public class SuperKeyword_1 {
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
class B extends A{
    @Override
    void abc(){
        System.out.println("B 클래스의 abc()");
    }
    void bcd(){
        abc(); // this.abc();
    }
}