package javaplus.constructor;

public class Constructor2 {
    int num;
    String name;
    //기본 생성자
    Constructor2(){
        num = 100;
        name = "나";
    }
    //매개변수가 있는 생성자
    Constructor2(int i, String n){
        num = i;
        name = n;
    }

    public static void main(String[] args) {
        //객체 생성
        Constructor2 myObject = new Constructor2(100,"나");

        //객체 출력
        System.out.println("num: " + myObject.num);
        System.out.println("name: " + myObject.name);

    }
}
