package javaplus.superkeyword.Ex03;

public class SuperKeyword_3 {

    public static void main(String[] args) {

        //1. A 객체 생성
        A aa = new A();
        System.out.println(); //A 생성자

        //2. B 객체 생성
        B bb = new B();

    }
}

class A{
    A(){
        System.out.println("A 생성자");
    }
}
class B extends A{
    B(){
//        super(); // 생략시 컴파일러가 자동 추가(부모클래스의 생성자 호출)
        System.out.println("B 생성자");
    }
}
class C{
    C(int a){
        System.out.println("C 생성자");
    }
}
class D extends C{
    // C에 기본 생성자 없기 떄문에 오류
    D(){
        super(3);// 이런식으로 super 메서드를 따로 작성해 줘야 한다.
    }
}