package javaplus.reference;

public class MethodOVerloading {
    public static void main(String[] args) {
//        int a;
//        double a; 필드는 이름을 가지고 구분하기 때문에 불가능
        print();//데이터가 없습니다.
        print(3); //3
        print(5.8);
        print(2,5);

    }
    public static void print(){
        System.out.println("데이터가 없습니다.");
    }
    public static void print(int a){
        System.out.println(a);
    }
//    public static void print(int b{
//        System.out.println(b);
//    }
    public static void print(double a){
        System.out.println(a);
    }
    public static void print(int a, int b){
        System.out.println("a: " + a + "b: " + b);
    }
//    public static int print(int a, int b){
//        System.out.println("a: " + a + "b: " + b);
//        return a + b;
//    }


}

