package javaplus.Collection;
import java.util.ArrayList;
public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<String>languages = new ArrayList<>();

        //add elements to ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        System.out.println("ArrayList: " + languages);

        // trim capacity to 3
        languages.trimToSize();
        System.out.println("Size of ArrayList:" + languages.size());

    }
}
