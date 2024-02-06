package javaplus.constructor;

public class ThisEx {
    int a;
    int b;

    //기본 생성자
    public ThisEx(){
        this(0,0); // 다른 생성자 호출
    }

    //매개변수가 있는 생성자
    public ThisEx(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        //매개변수가 있는 생성자를 사용하여 객체 생성
        ThisEx ex1 = new ThisEx(10,20);

        //객체의 상태 출력
        System.out.println("example1 a: " + ex1.a);
        System.out.println("example1 b: " + ex1.b);

        //기본 생성자를 사용하여 또 다른 객체 생성
        ThisEx ex2 = new ThisEx();

        //두 번쨰 객체의 상태 출력
        System.out.println("example2 a: " + ex2.a);
        System.out.println("example2 b: " + ex2.b);
    }


}
