package javaplus.constructor;

//1. 클래스 내부에서필드, 메서드에 붙는 자동으로 붙는 this 키워드

class A3{
    int m;
    int n;
    void init(int a, int b){
        this.m = a;
        this.n = b;
    }
    void work(){
        this.init(2, 3);//객체를 사용하는 것이므로 반드시 this가 앞에 붙어야 하는데, 생략되어 있다.
    }
}

public class ThisKeyword {
    public static void main(String[] args) {

        //2. 클래스 객체 생성
        A3 a = new A3();

        //3. 메서드 호출 / 필드값 활용
        a.work();
        System.out.println(a.m);
        System.out.println(a.n);

    }
}
