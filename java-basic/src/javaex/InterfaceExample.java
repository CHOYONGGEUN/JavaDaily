package javaex;

// 인터페이스 선언
interface Drawable {
    void draw(); // 추상 메서드 선언
}

// 인터페이스 구현하는 클래스
class Circle1 implements Drawable {
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

// 또 다른 인터페이스 구현하는 클래스
class Rectangle1 implements Drawable {
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Drawable d1 = new Circle1();
        Drawable d2 = new Rectangle1();

        d1.draw();  // Drawing a circle.
        d2.draw();  // Drawing a rectangle.
    }
}
