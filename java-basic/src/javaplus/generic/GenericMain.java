package javaplus.generic;

import java.util.ArrayList;
import java.util.List;

class Fruit {}
class Apple extends Fruit{}
class Banana extends Fruit{}

class FruitBox<T>{
    List<T> fruits = new ArrayList<>();

    public void add(T fruit){
        fruits.add(fruit);
    }
}

public class GenericMain {
    public static void main(String[] args) {
        FruitBox<Fruit>box = new FruitBox<>();

        //다형성 원리 적용
        box.add(new Fruit());
        box.add(new Apple());
        box.add(new Banana());
    }
}
