package javaplus.over;

public class OverloadingEx {
    void demo(int a){
        System.out.println(a);
    }
    void demo(int a, int b){
        System.out.println(a+ "," + b);
    }
    double demo(double a){
        System.out.println(a);

        return a;
    }
}
