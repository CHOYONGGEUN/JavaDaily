package javaplus.innerclassandinnerinterface.annonymousclass.ex04;

public class AnnonymousClass_4 {
    public static void main(String[] args) {
        C c = new C();

        // #2. 방법#3. 클래스명 X + 참조변수명 O
       A a = new A(){
           @Override
           public void abc() {
               System.out.println("매개변수 전달");
           }
       };
        c.cde(a);//매개변수 전달

        // #4. 방법 #4 클래스명 X + 참조변수명 X
        c.cde( new A(){
            @Override
            public void abc() {
                System.out.println("매개변수 전달");
            }
        });
    }
}


interface  A{
    void abc();
}

class C{
    void cde(A a){
        a.abc();
    }
}