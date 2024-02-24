package javaplus.inheritancepoly;

//상속관계 만들기
class A{}
class B extends A{}
class C extends B{}
class D extends B{}

public class Poly {
    public static void main(String[] args) {
        //1. A 타입의 다형적 표현
        A a1 = new A(); //A는 A이다.
        A a2 = new B();//B는 A이다.
        A a3 = new C();//C는 A이다.
        A a4 = new D();//D는 A이다.

        //2. B 타입의 다형적 표현
//        B b1 = new A(); // A는 B이다.(오류)
        B b2 = new B();// A는 B이다.
        B b3 = new C();// A는 B이다.
        B b4 = new D();// A는 B이다.

        //3. C 타입의 다형적 표현
//        C c1 = new A(); //A는 C이다. 오류
//        C c2 = new B();//B는 C이다. 오류
        C c3 = new C();//C는 C이다.
//        C c4 = new D();//D는 C이다. 오류

        //4. D 타입의 다형적 표현
//        D d1 = new A(); //A는 D이다. 오류
//        D d2 = new B();//B는 D이다. 오류
//        D d3 = new C();//C는 D이다. 오류
        D d4 = new D();//D는 D이다.
    }
}
