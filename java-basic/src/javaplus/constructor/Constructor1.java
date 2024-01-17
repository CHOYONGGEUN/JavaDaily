package javaplus.constructor;

    class Car {
        String modelName;
        int modelYear;
        String color;
        int maxSpeed;
        int currentSpeed;

        // 생성자 (인스턴스 변수 값 초기화)
        Car(String modelName, int modelYear, String color, int maxSpeed) {
            this.modelName = modelName; // 메서드의 입력값으로 인스턴스 변수의 값을 지정
            this.modelYear = modelYear;
            this.color = color;
            this.maxSpeed = maxSpeed;
            this.currentSpeed = 0; // 입력값 없이 디폴트 초기화
        }

        String getModel() {
            return this.modelYear + "년식 " + this.modelName + " " + this.color;
        }
    }

    public class Constructor1 {
        public static void main(String[] args) {
            Car myCar1 = new Car("아반떼", 2016, "흰색", 250); // 생성자의 호출
            Car myCar2 = new Car("제네시스", 2020, "검은색", 500); // 생성자의 호출
            Car myCar3 = new Car("티코", 2003, "빨간색", 100); // 생성자의 호출

            System.out.println(myCar1.getModel()); // 2016년식 아반떼 흰색
            System.out.println(myCar2.getModel()); // 2020년식 제네시스 검은색
            System.out.println(myCar3.getModel()); // 2003년식 티코 빨간색
        }
    }

