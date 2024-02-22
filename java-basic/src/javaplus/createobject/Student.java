package javaplus.createobject;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public void showStudentInfor(){
        System.out.println(studentName + "," + address);
    }

    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String name){
        studentName = name;
    }

    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentName = "이순신";
        studentLee.studentID = 100;
        studentLee.address = "서울시 영등포구 여의도동";

        Student studentKim = new Student();
        studentKim.studentName = "김유신";
        studentKim.studentID = 200;
        studentKim.address = "서울시 강동구 천호동";

        studentLee.showStudentInfor();
        studentKim.showStudentInfor();

        System.out.println(studentLee);
        System.out.println(studentKim);
    }


}
