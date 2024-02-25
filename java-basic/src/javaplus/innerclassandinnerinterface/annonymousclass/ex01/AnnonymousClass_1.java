package javaplus.innerclassandinnerinterface.annonymousclass.ex01;

public class AnnonymousClass_1 {
    public static void main(String[] args) {
        //1. 객체 생성 및 메서드 호출
        A a = new A();
        a.abc(); //
    }
}

class A{
    C c = new B();

    void abc(){
        c.bcd();
    }
    class B implements C{

        @Override
        public void bcd() {
            System.out.println("인스턴스 이너클래스");

        }
    }
}
interface C{
    public abstract void bcd();
}