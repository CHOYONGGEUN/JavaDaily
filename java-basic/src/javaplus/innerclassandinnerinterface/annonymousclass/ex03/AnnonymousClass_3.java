package javaplus.innerclassandinnerinterface.annonymousclass.ex03;

public class AnnonymousClass_3 {
    public static void main(String[] args) {
        C c = new C();

        //1. A타입의 객체 생성: 1. 방법#1 클래스명 O + 참조변수명 O
        A a = new B();
        c.cde(a);//매개변수 전달

        // 2. 방법 #2 클래스명 O + 참조변수명 X
        c.cde(new B());

    }
}
interface  A{
    void abc();
}

//1. 자식클래스를 직접 생성
class B implements A{
    @Override
    public void abc() {
        System.out.println("매개변수 전달");
    }
}
class C{
    void cde(A a){
        a.abc();
    }
}