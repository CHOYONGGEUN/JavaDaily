package javaplus.casting;

public class InstanceEx {
    public static void main(String[] args) {
        //Game 인스턴스 생성
        Game mygame = new Game("fifa","lol");
        Game yourgame = new Game("overwatch","suddenattack");

        //생성된 인스턴스를 사용해서 정보 출력
        mygame.displayInfo();
        yourgame.displayInfo();

    }
}

class Game{
    //Game 클래스의 속성(필드)
    String game1;
    String game2;
    //Game 클래스의 생성자
    Game(String game1, String game2){
        this.game1 = game1;
        this.game2 = game2;
    }
    //자동차 정보를 출력하는 메서드
    void displayInfo(){
        System.out.println("게임 1: " + game1 +  " 게임 2: " + game2);
    }
}