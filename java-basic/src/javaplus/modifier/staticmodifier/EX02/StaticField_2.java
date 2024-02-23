package javaplus.modifier.staticmodifier.EX02;


//static 필드의 공유 특징

public class StaticField_2 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();

        //인스턴스 필드
        a1.m = 5;
        a2.m = 6;
        System.out.println(a1.m); //5
        System.out.println(a2.m); //6

        //정적필드
        a1.n = 7;
        a2.n = 8;
        System.out.println(a1.n);//8 동일한 공간을 공유하기 때문에 8을 출력
        System.out.println(a2.n);//8

        A.n = 9;
        System.out.println(A.n);//9
        System.out.println(A.n);//9
    }
}

class A{
    int m = 3; //인스턴스 필드
    static int n = 5;//정적(static) 필드
}

