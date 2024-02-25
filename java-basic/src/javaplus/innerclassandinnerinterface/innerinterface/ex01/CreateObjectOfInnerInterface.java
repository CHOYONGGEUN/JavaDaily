package javaplus.innerclassandinnerinterface.innerinterface.ex01;

public class CreateObjectOfInnerInterface {
    public static void main(String[] args) {
        //객체생성 방법 #1 (자식클래스 직접 생성)
        A.B ab = new C();
        C c = new C();
        //객체생성 방법 #2 (익명이너클래스 직접 생성)
        A.B b = new A.B(){
            @Override
            public void bcd() {
                System.out.println("익명 이너클래스로 객체 생성");
            }
        };

    }
}
class A{
    interface B{ //이너인터페이스는 앞에 반드시 static이 붙는다.
          void bcd();
    }
}
class C implements  A.B{
    @Override
    public void bcd() {
        System.out.println("이너인터페이스 구현 클래스 생성");

    }
}