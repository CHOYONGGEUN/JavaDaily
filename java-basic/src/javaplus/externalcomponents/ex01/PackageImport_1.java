package javaplus.externalcomponents.ex01;


import javaplus.externalcomponents.common.CommonEx;
import javaplus.externalcomponents.ex02.PackageImport_2;

import java.net.CookieHandler;

//다른 패키지에 있는 클래스를 가져와 활용하는 방법
public class PackageImport_1 {
    public static void main(String[] args) {
        //1. 객체 생성
//        CommonEx a = new CommonEx();
        javaplus.externalcomponents.common.CommonEx a = new javaplus.externalcomponents.common.CommonEx();

        //2. 멤버 활용
        System.out.println(a.m);
        System.out.println(a.n);
        a.print();


    }
}
