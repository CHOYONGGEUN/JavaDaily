package accessmodifiers;

class DefaultEx {//접근 제어자를 명시하지 않음, package-private 클래스
    int defaultNumber; //같은 패키지 내에서만 접근 가능

    void showNumber(){
        System.out.println("Default Number: " + defaultNumber);
    }

}

class TestDefault{
    public static void main(String[] args) {
        DefaultEx ex = new DefaultEx();
        ex.defaultNumber = 30;
        ex.showNumber();
    }
}

