package javaplus.overlapmember.Ex03;

public class OverlapStaticMethod {
    public static void main(String[] args) {
        //1. 클래스 이름으로 바로 접근
        A.print();
        B.print();


    }
}

class A {
    static void print() {
        System.out.println("A 클래스");
    }
    }
class B extends A {
    static void print() {
        System.out.println("B 클래스");
    }
}