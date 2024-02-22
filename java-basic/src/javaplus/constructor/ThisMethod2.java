package javaplus.constructor;

public class ThisMethod2 {
    public static void main(String[] args) {
        //1. 세가지 객체 생성(this() 미사용)
        A6 a1 = new A6();
        A6 a2 = new A6(10);
        A6 a3 = new A6(10,20);
        a1.print();
        a2.print();
        a3.print();

        B6 b1 = new B6();
        B6 b2 = new B6(30);
        B6 b3 = new B6(30,40);
        b1.print();
        b2.print();
        b3.print();

    }
}


//this(생성자 매개변수) 활용

class A6{
    int m1, m2, m3, m4;
    A6(){
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }
    A6(int a){
        m1 = a;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }
    A6(int a, int b){
        m1 = a;
        m2 = b;
        m3 = 3;
        m4 = 4;
    }
    void print(){
        System.out.print(m1 + " ");
        System.out.print(m2 + " ");
        System.out.print(m3 + " ");
        System.out.print(m4);
        System.out.println();
    }
}


class B6{
    int m1, m2, m3, m4;
    B6(){
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }
    B6(int a){
        this();
        m1 = a;
    }
    B6(int a, int b){
        this(a);
        m2 = b;

//        this();
//        m1 = a;
//        m2 = b;
    }
    void print(){
        System.out.print(m1 + " ");
        System.out.print(m2 + " ");
        System.out.print(m3+ " ");
        System.out.println(m4);
        System.out.println();
    }
}