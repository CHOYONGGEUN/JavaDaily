package javaplus.stream;
import java.util.*;
public class ForEachEx2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a","apple");
        map.put("b","bear");
        map.put("c","coin");

        map.forEach((key,value)->System.out.println(key + " : " + value));

    }
}
