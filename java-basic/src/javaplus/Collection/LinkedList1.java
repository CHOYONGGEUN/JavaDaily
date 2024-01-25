package javaplus.Collection;

import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        System.out.println("LinkedList: " + animals);
    }
}
