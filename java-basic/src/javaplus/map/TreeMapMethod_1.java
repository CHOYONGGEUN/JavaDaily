package javaplus.map;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMethod_1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        for(int i =20; i>0; i -=2){
            treeMap.put(i, i + " 번쨰 데이터");
        }
        System.out.println(treeMap);

        //#1. firstKey()
        System.out.println(treeMap.firstKey());

        //#2. firstEntry()
        System.out.println(treeMap.firstEntry());

        //#3. lastKey()
        System.out.println(treeMap.lastKey());

        //#4. lastEntry()
        System.out.println(treeMap.lastEntry());

        //#5. lowerKey(K key)
        System.out.println(treeMap.lowerKey(11)); //10
        System.out.println(treeMap.lowerKey(10)); //8

        //#6. higherKey(K key)
        System.out.println(treeMap.higherKey(11)); //12
        System.out.println(treeMap.higherKey(10)); //12

        //#7. pollFirstEntry()
        System.out.println(treeMap.pollFirstEntry()); //2번째 데이터가 꺼내져서 없어짐
        System.out.println(treeMap);

        //#8. pollLastEntry()
        System.out.println(treeMap.pollLastEntry());
        System.out.println(treeMap);

        //#9. SortedMap<K,V>headMap(K toKey)
        SortedMap<Integer, String> sortedMap = treeMap.headMap(8);
        System.out.println(sortedMap); //4, 6

        //#10. Navigable<K,V>headMap(K toKey, boolean inclusive)
        NavigableMap<Integer, String> navigableMap = treeMap.headMap(8,true);
        System.out.println(navigableMap); //4,6,8

        // #11. SortedMap<K,V>tailMap(K toKey)
        sortedMap = treeMap.tailMap(14);
        System.out.println(sortedMap); //14,16,18

        // #12. Navigable<K,V>tailMap(K toKey, boolean inclusive)
        navigableMap = treeMap.tailMap(14, false);
        System.out.println(navigableMap); //16,18

        // #13. SortedMap<K,V>subMap(K fromKey, K toKEy)
        sortedMap = treeMap.subMap(6,10);
        System.out.println(sortedMap); //6,8

        // #14. Navigable<K,V>subMap(K toKey, boolean inclusive)
        navigableMap = treeMap. subMap(6,false,10,true);
        System.out.println(navigableMap); //8,10

        //#15. NavigableSet<K> descendingKeySet()
        NavigableSet<Integer> navigableSet = treeMap.descendingKeySet();
        System.out.println(navigableSet);
        System.out.println(navigableSet.descendingSet());

        //#16. NavigableMap<K, V> descendingMap()
        navigableMap = treeMap.descendingMap();
        System.out.println(navigableMap);
        System.out.println(navigableMap.descendingMap());
    }
}
