package javaplus.reference;

public class EffectOfPrimaryDataArgument {
    public static void main(String[] args) {

        int a = 3;
        int result1 = twice(3);
        System.out.println(result1);//6

        int result2 = twice(a);
        System.out.println(result2);//6

        System.out.println(a);//3 , twice 메서드는 메모리에서 사라짐
    }
    public static int twice(int a){
        a = a * 2;
        return a;
    }
}
