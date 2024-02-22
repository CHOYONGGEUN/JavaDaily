package javaplus.InternalComponents;

//# 1. 클래스 생성(정의)

class A1{
    boolean m1;
    int m2;
    double m3;
    String m4;
    void printFieldValue(){
        System.out.println(m1);//false
        System.out.println(m2);//0
        System.out.println(m3);//0.0
        System.out.println(m4);//null 객체를 가리키지 않고 있다.
    }
    void printLocalVariable(){
        int k;//지역변수이기 때문에 값을 초기화하지 않으면 오류가 발생
//        System.out.println(k);//지역변수는 반드시 초기화 필요
    }

}

public class FieldEx2 {
    public static void main(String[] args) {

        //#2. 클래스를 활용하여 객체 생성
        A1 a = new A1();

        //#3. 객체 활용
        a.printFieldValue();

    }
}
