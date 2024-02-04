package accessmodifiers;

public class publicEx {
    public int publicNumber; //어디서든 접근 가능한 변수

    public void showNumber(){
        System.out.println("Public Number: " + publicNumber);
    }
}

class TestPUblic{
    public static void main(String[] args) {
        publicEx example = new publicEx();
        example.publicNumber= 10;//다른 클래스에서 접근 가능
        example.showNumber();//다른 클래스에서 접근 가능
    }
}
