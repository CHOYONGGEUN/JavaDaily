package javaplus.modifier.staticmodifier.EX04;

public class StaticModifier_3 {
    public static void main(String[] args) {
//        System.out.println(A.b); //static은 생성자를 사용할 수 없다.
        System.out.println(A.b); //static 내에서 필드를 초기화한 후에는 숫자 출력이 된다.

    }
}

//정적(static) 초기화 블록
class A{
    int a;
    static int b;

    static{
        b = 5; //static 필드의 초기화는 static{} 내에서 수행
        System.out.println("ㅋㄹ래스 A가 로딩되었습니다!!");
    }

    A(){
        a = 3; //인스턴스 필드 초기화는 생성자에서 일반적으로 수행
        b = 5;
    }
}