package javaplus.casting;

public class InstanceofEx {
    public static void main(String[] args) {
        People p = new People();
        Me m = new Me();
        People p2 = new Me();

        System.out.println(p instanceof People);//true
        System.out.println(m instanceof Me);//true
        System.out.println(m instanceof People);//true, Me는 People의 자식 클래스이다.
        System.out.println(p instanceof Me);//false, People 인스턴스는 Me의 인스턴스가 아니다.
        System.out.println(p2 instanceof Me);//true, p2는 Me의 인스턴스롤 참조한다.
    }
}
class People{}
class Me extends People{}
