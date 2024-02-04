package accessmodifiers;

public class PrivateEx {
    private int privateNumber; //같은 클래스 내에서만 접근 가능한 변수

    public void setPrivateNumber(int privateNumber){
        this.privateNumber = privateNumber;
    }

    public void showNumber(){
        System.out.println("Private Number: " + privateNumber);
    }
}

class TestPrivate{
    public static void main(String[] args) {
        PrivateEx ex = new PrivateEx();
        ex.setPrivateNumber(20);
        ex.showNumber();
    }
}
