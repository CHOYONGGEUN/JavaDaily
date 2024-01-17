package javaplus.classex;

    class Method {
        static int x = 100, y = 200; // 클래스(static) 변수

        int a = 10, b = 20; // 인스턴스 변수

        int add() { // 인스턴스 메소드
            return this.a + this.b; // 인스턴스 변수끼리 합
        }

        static int addStatic() { // 클래스(static) 메소드
            return Method.x + Method.y; // 클래스 변수끼리 합
        }
    }

    public class Class1 {
        public static void main(String[] args) {
            System.out.println(Method.addStatic()); // 클래스 메소드의 호출 : 300

            Method myMethod = new Method();         // 인스턴스 생성
            System.out.println(myMethod.add());     // 인스턴스 메소드의 호출 : 30
        }
    }

