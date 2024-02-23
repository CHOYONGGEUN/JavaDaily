package javaplus.externalcomponents.ex02;


//import 사용

import javaplus.externalcomponents.common.CommonEx;
public class PackageImport_2 {
    public static void main(String[] args) {

        CommonEx a = new CommonEx();

        //2. 멤버 활용
        System.out.println(a.m);
        System.out.println(a.n);
        a.print();

    }



}
