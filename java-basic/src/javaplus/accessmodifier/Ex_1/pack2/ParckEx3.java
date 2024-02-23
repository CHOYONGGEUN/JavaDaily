package javaplus.accessmodifier.Ex_1.pack2;

import javaplus.accessmodifier.Ex_1.pack1.PackEx;

public class ParckEx3 {
    public void print(){
        //1. 객체 생성
        PackEx a = new PackEx();
        //2.멤버 활용
        System.out.println(a.a);//가능
//        System.out.println(a.b);//불가능
//        System.out.println(a.c);//불가능
//        System.out.println(a.d);//불가능
    }
}
