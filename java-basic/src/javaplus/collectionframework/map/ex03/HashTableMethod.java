package javaplus.collectionframework.map.ex03;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableMethod {
    public static void main(String[] args) {
        Map<Integer, String> hasTable1 = new Hashtable<>();

        //#1. put(K key, V value)
        hasTable1.put(2, "나다라");
        hasTable1.put(1, "가나다");
        hasTable1.put(3, "다라마");

        System.out.println(hasTable1);

        //#2. putAll(다른 맵객체)
        Map<Integer, String> hashTable2 = new Hashtable<>();
        hashTable2.putAll(hasTable1);
        System.out.println(hashTable2);

        //#3. replace(K, key, V value)
        hashTable2.replace(1, "가가가");
        hashTable2.replace(4, "라라라"); //동작 안 함
        System.out.println(hashTable2);

        //#4. replace(K key, V old Value, V new Value)
        hashTable2.replace(1, "가가가", "나나나");
        hashTable2.replace(2, "다다다","라라라"); //동작 안 함
        System.out.println(hashTable2);

        //#5. V get(Object key)
        System.out.println(hashTable2.get(1));
        System.out.println(hashTable2.get(2));
        System.out.println(hashTable2.get(3));

        //#6. containsKey(Object key)
        System.out.println(hashTable2.containsKey(1));//true
        System.out.println(hashTable2.containsKey(5));//false

        //#7. containsValue(Object value)
        System.out.println(hashTable2.containsValue("나나나"));//true
        System.out.println(hashTable2.containsValue("다다다"));//false

        //#8. Set<K>keySet()

        Set<Integer> keySet = hashTable2.keySet();
        System.out.println(keySet);

        //#9. Set<Map.Entry<K,V> entrySet()
        Set<Map.Entry<Integer, String>> entrySet = hashTable2.entrySet();
        System.out.println(entrySet);

        //#10. size();
        System.out.println(hashTable2.size());

        //#11. remove(Object key);
        hashTable2.remove(1);
        hashTable2.remove(4);
        System.out.println(hashTable2);

        //#12. remove(Object key, Object value);
        hashTable2.remove(2, "나다라");
        hashTable2.remove(3, "다다다");
        System.out.println(hashTable2);

        //#13. clear()
        hashTable2.clear();
        System.out.println(hashTable2);

    }
}
