package javaplus.Collection;

import java.util.*;

public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        String from = "b";
        String to = "d";

        set.add("abc");
        set.add("car");
        set.add("dance");
        set.add("elephant");
        set.add("flower");

        System.out.println(set);
        System.out.println("range search : from" + from + "to " + to);
        System.out.println("result1 : " + set.subSet(from, to));
        System.out.println("result2: " + set.subSet(from, to + "zz"));
    }
}
