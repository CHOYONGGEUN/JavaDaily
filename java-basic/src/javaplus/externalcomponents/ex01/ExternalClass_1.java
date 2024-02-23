package javaplus.externalcomponents.ex01;

// 외부클래스 정의(public을 정의할 수 없다.)
class CommonEx{
    int m = 3;
    int n = 4;
    void print(){
        System.out.println(m + ", " + n);
    }
}
public class ExternalClass_1 {
    public static void main(String[] args) {
        CommonEx ex = new CommonEx();
        ex.print();

    }
}
