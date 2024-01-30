package javaplus.stream;
import java.util.*;
public class ForEachEx1 {
    //내부 반복 : 스트림의 특징
    //간결한 코딩을 위해 람다식을 사용한다.
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.forEach(yyy -> System.out.println(list.indexOf(yyy) + " : " + yyy));
    }
}
