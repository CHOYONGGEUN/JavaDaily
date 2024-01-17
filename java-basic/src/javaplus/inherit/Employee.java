package javaplus.inherit;


    public class Employee {
        private String name;

        // 생성자를 직접 지정 → 디폴트 생성자는 작동치 않음
        public Employee(String name) {
            this.name = name;
        }
    }

    class Developer extends Employee {
        private double salary;

        public Developer(String name) {
            super(name); // 자식 생성자의 입력값 name을 받아 부모 생성자 public Employee(String name) 를 호출
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }
    }

