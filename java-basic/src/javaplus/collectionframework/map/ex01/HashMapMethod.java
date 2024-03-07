package javaplus.collectionframework.map.ex01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethod {
    public static void main(String[] args) {
        Map<Integer, String> hmap1 = new HashMap<>();

        //#1. put(K key, V value)
        hmap1.put(2, "나다라");
        hmap1.put(1, "가나다");
        hmap1.put(3, "다라마");

        System.out.println(hmap1);

        //#2. putAll(다른 맵객체)
        Map<Integer, String> hmap2 = new HashMap<>();
        hmap2.putAll(hmap1);
        System.out.println(hmap2);

        //#3. replace(K, key, V value)
        hmap2.replace(1, "가가가");
        hmap2.replace(4, "라라라"); //동작 안 함
        System.out.println(hmap2);

        //#4. replace(K key, V old Value, V new Value)
        hmap2.replace(1, "가가가", "나나나");
        hmap2.replace(2, "다다다","라라라"); //동작 안 함
        System.out.println(hmap2);

        //#5. V get(Object key)
        System.out.println(hmap2.get(1));
        System.out.println(hmap2.get(2));
        System.out.println(hmap2.get(3));

        //#6. containsKey(Object key)
        System.out.println(hmap2.containsKey(1));//true
        System.out.println(hmap2.containsKey(5));//false

        //#7. containsValue(Object value)
        System.out.println(hmap2.containsValue("나나나"));//true
        System.out.println(hmap2.containsValue("다다다"));//false

        //#8. Set<K>keySet()

        Set<Integer> keySet = hmap2.keySet();
        System.out.println(keySet);

        //#9. Set<Map.Entry<K,V> entrySet()
        Set<Map.Entry<Integer, String>> entrySet = hmap2.entrySet();
        System.out.println(entrySet);

        //#10. size();
        System.out.println(hmap2.size());

        //#11. remove(Object key);
        hmap2.remove(1);
        hmap2.remove(4);
        System.out.println(hmap2);

        //#12. remove(Object key, Object value);
        hmap2.remove(2, "나다라");
        hmap2.remove(3, "다다다");
        System.out.println(hmap2);

        //#13. clear()
        hmap2.clear();
        System.out.println(hmap2);




    }
}
