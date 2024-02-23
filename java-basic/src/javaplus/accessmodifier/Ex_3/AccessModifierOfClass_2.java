package javaplus.accessmodifier.Ex_3;

import javaplus.accessmodifier.Ex_2.A;
import javaplus.accessmodifier.Ex_2.B;
import javaplus.accessmodifier.Ex_2.C;
import javaplus.accessmodifier.Ex_2.D;

public class AccessModifierOfClass_2 {
    public static void main(String[] args) {
        //1. 객체 생성
        javaplus.accessmodifier.Ex_2.A a = new A();//객체 생성 가능(A a ) + 생성자 호출 가능 (new A())
        javaplus.accessmodifier.Ex_2.B b = new B();//객체 생성 가능(A a ) + 생성자 호출 가능 (new A())
//        javaplus.accessmodifier.Ex_2.C c = new C();//객체 생성 가능(A a ) + 생성자 호출 가능 (new A())
        D d = new D();//객체 생성 가능(A a ) + 생성자 호출 가능 (new A())
    }
}
