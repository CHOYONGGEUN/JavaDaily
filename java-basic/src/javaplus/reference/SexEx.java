package javaplus.reference;


class Person2{
    String name;
    int age;

    public Person2(){
        this("이름없음", 1);
    }
    public Person2(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class SexEx {
    public static void main(String[] args) {

        Person2 p1 = new Person2();
        System.out.println(p1.name);
        System.out.println(p1.age);

    }
}
