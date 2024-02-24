package javaplus.abstractmodifier.ex01;

public class AbstractModifier_1 {

    public static void main(String[] args) {
        //1, 객체 생성
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        //2. 메서드 호출
        animal1.cry(); //야옹
        animal2.cry();//멍멍
    }
}

//일반 클래스를 상속하는 경우

class Animal{
    void cry() {
    }

}
class Cat extends Animal{
    void cry(){
        System.out.println("아옹");
    }
}

class Dog extends Animal {
    void cry(){
        System.out.println("멍멍");
    }
}