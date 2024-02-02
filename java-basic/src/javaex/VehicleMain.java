package javaex;

public class VehicleMain {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 1985);
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelYear);
    }
}

class Vehicle{
    String brand;
    //Vehicle 클래스 생성
    Vehicle(String b){
        brand =b;
    }
    void honk(){
        System.out.println("bang bang");
    }
}
//Vehicle 클래스를 상속받는 Car 클래스

class Car extends Vehicle{
    int modelYear;
    //Car 클래스 생성자
    Car(String b, int year){
        super(b); //부모 클래스의 생성자 호출(반드시 먼저 호출되야 한다.)
        modelYear = year;
    }
}
