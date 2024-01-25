package javaplus.Collection;
import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer>ages = new ArrayList<>();

        ages.add(10);
        ages.add(12);
        ages.add(15);
        ages.add(19);
        ages.add(23);
        ages.add(34);
        System.out.println("List of Age: " + ages);

        System.out.println("Ages below 18: " + ages.subList(0,3));

        System.out.println("Ages above 18: " + ages.subList(3,ages.size()));
    }
}
