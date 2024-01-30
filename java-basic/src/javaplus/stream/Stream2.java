package javaplus.stream;

import java.util.*;
import java.util.stream.Stream;

public class Stream2 {
    class Student {
        private int stuNum;
        private String stuName;
        private boolean isCome;

        Student(int stuNum, String stuName, boolean isCome) {
            this.stuNum = stuNum;
            this.stuName = stuName;
            this.isCome = isCome;
        }

        @Override
        public String toString() {
            return "Student{" + "stuNum=" + stuNum + ", stuName='" + stuName + ", isCome=" + isCome + '}';
        }
    }

    public static void main(String[] args) {
        Stream2 t = new Stream2();

        Student stu1 = t.new Student(1, "조성모", true);
        Student stu2 = t.new Student(2, "김태우", false);
        Student stu3 = t.new Student(3, "박효신", false);

        //List에 요소 추가하고 스트림 얻기
        List<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        Stream<Student> studentStream = list.stream();
        studentStream.forEach(a-> System.out.println(a));


        //studentSet에 요소를 추가하는 코드
        Set<Student> set = new HashSet<>();
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        set.stream().forEach(a-> System.out.println(a));
    }
}
