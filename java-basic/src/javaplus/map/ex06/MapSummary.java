package javaplus.map.ex06;


import com.sun.source.tree.Tree;
import javaplus.collectionframework.map.ex03.HashTableMethod;

import java.util.*;

public class MapSummary {
    public static void main(String[] args) {

        // #1. HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("다", 30);
        hashMap.put("마", 40);
        hashMap.put("나", 50);
        hashMap.put("가", 60);
        System.out.println(hashMap);

        // #2. HashTable
        Map<String, Integer> hashTable = new Hashtable<>();
        hashTable.put("다", 30);
        hashTable.put("마", 40);
        hashTable.put("나", 50);
        hashTable.put("가", 60);
        System.out.println(hashTable);
        
        // #2. HashTable
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("다", 30);
        linkedHashMap.put("마", 40);
        linkedHashMap.put("나", 50);
        linkedHashMap.put("가", 60);
        System.out.println(linkedHashMap);

        // #2. TreeMap 입력순서와 상관없이 항상 오름차순으로 정렬
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("다", 30);
        treeMap.put("마", 40);
        treeMap.put("나", 50);
        treeMap.put("가", 60);
        System.out.println(treeMap);
    }
}
