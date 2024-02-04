package accessmodifiers;

public class ProtectedEx {
    protected int protectNumber; //같은 패키지 또는 다른 패키지의 자식 클래스에서만 접근

    protected void showNumber() {
        System.out.println("Protected Number: " + protectNumber);
    }
}

class TestProtected extends ProtectedEx{
    public static void main(String[] args) {
        TestProtected ex = new TestProtected();
        ex.protectNumber = 40; //상속받은 클래스에서 접근 가능
        ex.showNumber(); //상속받은 클래스에서 접근 가능
    }
}