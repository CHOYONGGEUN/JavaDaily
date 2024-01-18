package javaplus.abst;


    // 추상 클래스
    abstract class Pet {
        abstract public void walk(); // 추상 메소드
        abstract public void eat(); // 추상 메소드

        public int health; // 인스턴스 필드
        public void run() {  // 인스턴스 메소드
            System.out.println("run run");
        }
    }

    class Dog extends Pet {
        // 상속 받은 부모(추상) 메소드를 직접 구현
        public void walk() {
            System.out.println("Dog walk");
        }
        public void eat() {
            System.out.println("Dog eat");
        }
    }

    public class Abstract {
        public static void main(String[] args) {
            Dog d = new Dog();
            d.eat(); // 부모(추상) 클래스로 부터 상속받은 추상 메소드를 직접 구현한 메소드를 실행
            d.walk();
            d.run(); // 부모(추상) 클래스의 인스턴스 메소드 실행
        }
    }

