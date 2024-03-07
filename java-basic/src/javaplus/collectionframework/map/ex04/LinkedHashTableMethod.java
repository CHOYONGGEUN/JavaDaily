package javaplus.collectionframework.map.ex04;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashTableMethod {
    public static void main(String[] args) {
        Map<Integer, String> linkedHashMap1 = new LinkedHashMap<>();

        //#1. put(K key, V value)
        linkedHashMap1.put(2, "나다라");
        linkedHashMap1.put(1, "가나다");
        linkedHashMap1.put(3, "다라마");

        System.out.println(linkedHashMap1);

        //#2. putAll(다른 맵객체)
        Map<Integer, String> linkedHashMap2 = new LinkedHashMap<>();
        linkedHashMap2.putAll(linkedHashMap1);
        System.out.println(linkedHashMap2);

        //#3. replace(K, key, V value)
        linkedHashMap2.replace(1, "가가가");
        linkedHashMap2.replace(4, "라라라"); //동작 안 함
        System.out.println(linkedHashMap2);

        //#4. replace(K key, V old Value, V new Value)
        linkedHashMap2.replace(1, "가가가", "나나나");
        linkedHashMap2.replace(2, "다다다","라라라"); //동작 안 함
        System.out.println(linkedHashMap2);

        //#5. V get(Object key)
        System.out.println(linkedHashMap2.get(1));
        System.out.println(linkedHashMap2.get(2));
        System.out.println(linkedHashMap2.get(3));

        //#6. containsKey(Object key)
        System.out.println(linkedHashMap2.containsKey(1));//true
        System.out.println(linkedHashMap2.containsKey(5));//false

        //#7. containsValue(Object value)
        System.out.println(linkedHashMap2.containsValue("나나나"));//true
        System.out.println(linkedHashMap2.containsValue("다다다"));//false

        //#8. Set<K>keySet()

        Set<Integer> keySet = linkedHashMap2.keySet();
        System.out.println(keySet);

        //#9. Set<Map.Entry<K,V> entrySet()
        Set<Map.Entry<Integer, String>> entrySet = linkedHashMap2.entrySet();
        System.out.println(entrySet);

        //#10. size();
        System.out.println(linkedHashMap2.size());

        //#11. remove(Object key);
        linkedHashMap2.remove(1);
        linkedHashMap2.remove(4);
        System.out.println(linkedHashMap2);

        //#12. remove(Object key, Object value);
        linkedHashMap2.remove(2, "나다라");
        linkedHashMap2.remove(3, "다다다");
        System.out.println(linkedHashMap2);

        //#13. clear()
        linkedHashMap2.clear();
        System.out.println(linkedHashMap2);

    }
}
