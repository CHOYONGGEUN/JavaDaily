package javaplus.genenric.genericclass.ex01;


class Myclass<T>{
    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}
public class SingleGenericArgument {
    public static void main(String[] args) {
        Myclass<String> mc1 = new Myclass<String>();
        mc1.set("안녕");
        System.out.println(mc1.get());
        Myclass<Integer> mc2 = new Myclass<>();
        mc2.set(100);
        System.out.println(mc2.get());
//        Myclass<Integer> mc3 = new Myclass<>();
//        mc3.set("안녕"); //강한 타입 체크
    }
}
