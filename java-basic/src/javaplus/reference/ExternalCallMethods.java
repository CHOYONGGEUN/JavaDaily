package javaplus.reference;

//클래스의 외부에서 메서드 호출

// #1. 클래스의 정의
class A{
    //@1. 리턴타입: void + 매개변수 : 없음
    void print(){
        System.out.println("안녕");
    }
    //@2. 리턴타입: int + 매개변수 : 없음
    int data(){
        return 3;
    }
    //@3. 리턴타입: double + 매개변수 : 2개
    double sum(int a, double b){
        return a + b;
    }


    //@4. 리턴타입: void + 내부에 리턴 포함(함수를 종료한다는 의미)
    void printMonth(int m){
        if(m<0 || m>12){
            System.out.println("잘못된 입력입니다");
            return; // void 안에서 return은 함수 종료를 의미한다.
        }
        System.out.println(m + "월입니다");
    }

    }


public class ExternalCallMethods {
    public static void main(String[] args) {
        A a = new A();

        //#2. 객체 생성
        a.print();

        int k = a.data();
        System.out.println(k);

        double result = a.sum(3, 5.2);
        System.out.println(result);

        a.printMonth(5);
        a.printMonth(15);



        //#3. 메서드 호출(멤버 활용)

    }
}
