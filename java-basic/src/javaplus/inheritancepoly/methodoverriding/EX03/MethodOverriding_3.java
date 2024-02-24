package javaplus.inheritancepoly.methodoverriding.EX03;

public class MethodOverriding_3 {
    //1. A 타입 선언 / A 생성자 사용
    public static void main(String[] args) {
        A aa = new A();
        aa.print1();
        aa.print2();

        //2. B 타입 선언 / B 생성자 사용
        B bb = new B();
        bb.print1();
        bb.print2();
        bb.print2(3);

        //3. A 타입 선언 / B 생성자 사용
        A ab = new B();
        ab.print1();
        ab.print2();


    }

}
class A{
    void print1(){
        System.out.print("A 클래스 print1");
    }
    void print2(){
        System.out.println("A 클래스 print2");
    }
}
class B extends A{
    @Override
    void print1(){
        System.out.print("B 클래스 print1");
    }

//    @Override// 두 메서드가 다르기 때문에 오버라이딩 불가
    void print2(int a) {
        System.out.println("B 클래스 print2");
    }
}