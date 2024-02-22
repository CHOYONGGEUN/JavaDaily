package javaplus.reference;

public class StudentMain {
    public static void main(String[] args) {
        StudentEx student1 = new StudentEx(100, "James");
        student1.setKorea(100);
        student1.setMath(90);

        StudentEx student2 = new StudentEx(100, "Alice");
        student2.setKorea(70);
        student2.setMath(60);

        student1.showStudentInfo();
        student2.showStudentInfo();
    }
}
