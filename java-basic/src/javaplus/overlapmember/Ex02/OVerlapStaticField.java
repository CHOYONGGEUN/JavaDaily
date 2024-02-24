package javaplus.overlapmember.Ex02;

public class OVerlapStaticField {
    public static void main(String[] args) {
        //1. 클래스 이름으로 바로 접근
        System.out.println(A.m);
        System.out.println(B.m);

        //2. 객체 생성
        A aa = new A();
        B bb = new B();
        A ab = new B();

        //3. 객체 생성을 통한 static field
//        System.out.println(aa.m);
//        System.out.println(bb.m);
//        System.out.println(ab.m);
    }

}

class A{
    static int m = 3;
}
class B extends A {
    static int m = 4;
}
