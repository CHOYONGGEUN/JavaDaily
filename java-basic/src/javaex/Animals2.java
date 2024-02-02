package javaex;

public class Animals2 extends AnimalValue{
    String sound;

    //추상메서드 구현(재정의)
    @Override
    void sound(String sound){
        this.sound = sound;
    }
    @Override
    void behavior(){
        System.out.println(sound);
    }

    public static void main(String[] args) {
        Animals2 tiger = new Animals2();

        tiger.sound("어흥");
        tiger.behavior();
    }
}
//추상클래스
abstract class AnimalValue{
    abstract void sound(String sound);
    abstract void behavior();
}
