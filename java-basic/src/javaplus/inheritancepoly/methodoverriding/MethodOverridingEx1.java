package javaplus.inheritancepoly.methodoverriding;

public class MethodOverridingEx1 {
    public static void main(String[] args) {
        //1. A 타입 A 생성자
        A aa = new A();
        aa.print(); //A
        //2. B타입 B 생성자
        B bb = new B();
        bb.print(); //B

        //3. A 타입 B 생성자
        A ab = new B();
        ab.print(); //C
    }
}


class A{
    void print() {
        System.out.println("A 클래스");
    }
}

class B extends A {
    @Override
    void print() {
        System.out.println("B 클래스");
    }
}