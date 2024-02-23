package javaplus.accessmodifier.Ex_1.pack1;

public class PackEx2 {
    public void print(){
        //1. 객체 생성
        PackEx a = new PackEx();
        //2.멤버 활용
        System.out.println(a.a);//가능
        System.out.println(a.b);//가능
        System.out.println(a.c);//가능
//        System.out.println(a.d);//가능
    }
}
