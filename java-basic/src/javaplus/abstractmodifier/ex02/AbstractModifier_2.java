package javaplus.abstractmodifier.ex02;

public class AbstractModifier_2 {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        Animal a2 = new Dog();
        a1.cry();
        a2.cry();
    }

}

abstract class Animal{
    abstract void cry();

}
class Cat extends Animal{
    @Override
    void cry() {
        System.out.println("야옹");

    }
}

class Dog extends Animal {
    @Override
    void cry() {
        System.out.println("멍멍");

    }
}
//abstract class B{
//    void bcd(){}
//}