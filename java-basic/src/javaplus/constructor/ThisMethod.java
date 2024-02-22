package javaplus.constructor;

public class ThisMethod {
    public static void main(String[] args) {

        //2. 객체 생성
        A5 a1 = new A5();
        A5 a2 = new A5(5);


    }
}


//this(생성자의 매개변수) 문법적 특징과 의미: 자신이 속한 클래스의 다른 생성자 호출


//1. 클래스 정의
class A5{
    A5(){
        this(3);
        System.out.println("첫번째 생성자");
    }
    A5(int a ){
//        this(); //생성자의 첫줄에만 올 수 있다.
        System.out.println("두번째 생성자");
    }
}