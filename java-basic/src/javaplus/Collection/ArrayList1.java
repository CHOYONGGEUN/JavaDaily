package javaplus.Collection;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        //create an ArrayList
        ArrayList<String> languages = new ArrayList<>();

        //ArrayList에 요소 추가
        languages.add("JavaScript");
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        System.out.println("ArrayLIst: " + languages);

        //요소 1~3
        System.out.println("SubList: " + languages.subList(1,3));

    }

}
