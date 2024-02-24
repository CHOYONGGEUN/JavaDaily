package javaplus.inheritancepoly.methodoverriding.Ex2;

import javaplus.accessmodifier.Ex_2.B;
import javaplus.accessmodifier.Ex_2.D;

public class MethodOverriding2 {
    public static void main(String[] args) {
        //1. 각각의 타입으로 선언 + 각각의 타입으로 생성
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();
        Dog dog = new Dog();

        animal.cry();
        bird.cry();
        cat.cry();
        dog.cry();

        //2. Animal 타입으로 선언 + 자식 클래스 타입으로 생성
        Animal ab = new Bird();
        Animal ac = new Cat();
        Animal ad = new Dog();

        ab.cry();
        ac.cry();
        ad.cry();

        //3. 배열로 관리
        Animal[] animals = new Animal[]{ab, ac, ad};
        for (Animal a : animals) {
            a.cry();

        }

    }
}
class Animal{
    void cry(){

    }
}
class Bird extends Animal{
    @Override
    void cry() {
        System.out.println("짹짹");
    }
}

class Dog extends Animal{
    @Override
    void cry() {
        System.out.println("멍멍");
    }
}
class Cat extends Animal{
    @Override
    void cry() {
        System.out.println("야옹");
    }
}
