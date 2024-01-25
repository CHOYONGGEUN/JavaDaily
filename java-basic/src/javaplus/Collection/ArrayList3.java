package javaplus.Collection;
import java.util.ArrayList;
public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String>languages = new ArrayList<>();
        System.out.println("Newly Created ArrayList: " + languages);

        //ArrayList에 요소가 있는지 없는지 확인
        boolean result = languages.isEmpty(); //true
        System.out.println("Is the ArrayLIst Empty?" + result);

        //add some elements to the ArrayList
        languages.add("Python");
        languages.add("Java");
        System.out.println("Updated ArrayList: " + languages);

        //check if the ArrayList is empty
        result = languages.isEmpty(); //false
        System.out.println("Is the ArrayList empty?" + result);


    }
}
