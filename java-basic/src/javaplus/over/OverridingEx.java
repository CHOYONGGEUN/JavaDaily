package javaplus.over;

public class OverridingEx {
    void display() {
        System.out.println("부모 메서드");
    }
}

class Child extends OverridingEx {
    @Override
    void display() {
        System.out.println("자식 메서드");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.display(); // "자식 메서드" 출력

        OverridingEx parent = new OverridingEx();
        parent.display(); // "부모 메서드" 출력
    }
}
