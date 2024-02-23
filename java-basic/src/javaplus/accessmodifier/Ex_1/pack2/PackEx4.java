package javaplus.accessmodifier.Ex_1.pack2;

import javaplus.accessmodifier.Ex_1.pack1.PackEx;

public class PackEx4 extends PackEx{ //PackEx4 클래스는 PackEx클래스의 자식이다.

    public void print() {
        //1. 객체 생성
        PackEx a = new PackEx();
        //2.멤버 활용
        System.out.println(a.a);//가능
        System.out.println(b);//불가능
//        System.out.println(a.c);//불가능
//        System.out.println(a.d);//불가능
        System.out.println();
    }
}
