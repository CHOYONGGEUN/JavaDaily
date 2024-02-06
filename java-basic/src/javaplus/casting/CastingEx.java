package javaplus.casting;

public class CastingEx {
    public static void main(String[] args) {
        Animal animal = new Dog(); // 업캐스팅: Dog 객체를 Animal 타입으로 참조
        animal.eat();

        //다운캐스팅 전에 instanceof를 사용하여 안전하게 확인
        if(animal instanceof Dog){
            Dog dog = (Dog) animal; //다운캐스팅: Animal 타입을 Dog 타입으로 명시적 변환
            dog.bark();
        }
    }
}
class Animal{
    public void eat(){
        System.out.println("이 동물이 음식을 먹습니다.");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("개가 짖습니다.");
    }
}