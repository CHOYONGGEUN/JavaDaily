package javaplus.inherit;

public class Parent {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.display();
    }
}
class Parents{
    int a = 10;
}
class Child extends Parents{
    int a  = 20;
    void display(){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}
