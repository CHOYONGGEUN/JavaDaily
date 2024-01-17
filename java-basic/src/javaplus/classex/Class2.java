package javaplus.classex;

    class Test {
        // 메소드 원형
        void display(int num1) {
            System.out.println(num1);
        }

        // 메소드 오버로딩 : 매개변수 갯수가 다른 유형
        void display(int num1, int num2) {
            System.out.println(num1 * num2);
        }

        // 메소드 오버로딩 : 매개변수는 같지만, 매개변수 타입이 다른 유형
        void display(int num1, double num2) {
            System.out.println(num1 + num2);
        }

        // 매개변수는 같지만, 메서드 반환 타입이 다른 유형은 오버로딩이 되지 않는다.
        // 따라서 정수 타입을 반환하는 메서드를 작성하고 싶다면 그냥 새로 메서드를 만들면 된다.
        int display2(int num1, int num2) {
            return num1 + num2;
        }
    }

    public class Class2{
        public static void main(String[] args) {
            Test myfunc = new Test();

            myfunc.display(10);

            myfunc.display(10, 20);

            myfunc.display(10, 3.14);
        }
    }

