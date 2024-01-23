package javaplus.lamda;

import java.util.ArrayList;
import java.util.List;

public class LambdaTypeExam {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("Java");
        list.add("C");
        list.add("React");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();

        list.stream().forEach((String s) -> System.out.println(s));
        list.stream().forEach(s -> System.out.println(s));
        list.stream().forEach(System.out::println);
        //람다 표현식에서 list에 해당하는 것을 가져올 것이고, 해당 타입이 String이라고 추론이 가능하기 떄문에 String을 생략해도 된다.

    }
}
