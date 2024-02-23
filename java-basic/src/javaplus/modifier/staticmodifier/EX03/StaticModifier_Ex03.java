package javaplus.modifier.staticmodifier.EX03;

public class StaticModifier_Ex03 {
    public static void main(String[] args) {

        //1.인스턴스 메서드 활용방법(객체 생성 후 사용가능)
        A a1 = new A();
        a1.abc();//instance 메서드

        //2. 정적 메서드 활용
        //방법 1: 클래스 이름으로 바로 접근하여 활용
        A.bcd(); //static 메서드
//        //방법 2: 객체 생성 후에도 사용가능(가능한 지양)
//        A a2 = new A();
//        a2.bcd();

    }
}
class A{
    static int a;
    int b;

   void abc(){ //인스턴스 메서드
       System.out.println("instance 메서드");
   }
   static void bcd(){ //정적 메서드
       System.out.println("static 메서드");

   }
}