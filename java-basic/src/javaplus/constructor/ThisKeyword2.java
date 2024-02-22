package javaplus.constructor;


    class A4{
        int m;
        int n;
        void init(int m, int n){
            this.m = m;
            this.n = n;
        }
    }

public class ThisKeyword2 {
    public static void main(String[] args) {
        //1. 필드명과 지역변수 명이 같은 (this 키워드를 사용하지 않은 경우)
        A4 a = new A4();
        a.init(2,3);
        System.out.println(a.m);
        System.out.println(a.n);
    }


}

