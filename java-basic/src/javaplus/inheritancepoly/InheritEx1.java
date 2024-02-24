package javaplus.inheritancepoly;

public class InheritEx1 {
    public static void main(String[] args) {
        //1. Human 객체 생성
        Human h = new Human();
        h.name = "조용근";
        h.age = 27;
        h.eat();
        h.sleep();

        //2. Student 객체 생성
        Student s = new Student();
        s.name = "조킹근";
        s.age = 27;
        s.studnetID = 128;
        s.eat();
        s.sleep();
        s.goToSchool();

        //3. Worker 객체 생성
        Worker w = new Worker();
        w.name = "조당근";
        w.age = 27;
        w.workID = 456;
        w.eat();
        w.sleep();
        w.goTowork();

    }
}
class Human{
    String name;
    int age;
    void eat(){}
    void sleep (){}
}
class Student extends Human{
    int studnetID;

    void goToSchool() {
    }
}

class Worker extends Human {
    int workID;
    void goTowork() {

    }

}
