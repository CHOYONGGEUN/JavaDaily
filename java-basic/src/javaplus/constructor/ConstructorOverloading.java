package javaplus.constructor;



class A2{
    A2(){
        System.out.println("첫번째 생성자");
    }
    A2(int a){
        System.out.println("두번째 생성자");
    }

    A2(int a, int b){
        System.out.println("세번째 생성자");
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {

        //1. 세가지 생성자를 이용한 객체 생성
        A2 a1 = new A2(); //첫번째 생성자
        A2 a2 = new A2(2); // 두번쨰 생성자
        A2 a3 = new A2(3,5); // 세번째 생성자

    }
}
