package javaplus.createobject;



//#1. 클래스의 구성(쩡의) : 붕어빵 기계
class A{
    int m =3;

    void print(){
        System.out.println("객체 생성 및 활용");
    }
}
public class CreateObject1 {
    public static void main(String[] args) {

        //#2. 클래스로부터 객체 생성: 붕어빵
        A a = new A();

        //#3. 클래스 멤버 활용(필드활용:필드에 값을 읽기/쓰기, 메서드를 활용: 메서드 호출: 붕어빵 먹기
        a.m=5;
        System.out.println(a.m); //5 출력

        a.print(); //객체 생성 및 활용

    }
}
