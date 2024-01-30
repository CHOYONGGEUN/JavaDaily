package javaplus.Collection;
import java.util.*;
public class HashSetEx4 {
    public static void main(String[] args) {
        Set<String>set = new HashSet<>();

        //요소 추가
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        //중복된 요소 추가 시도(추가 되지 않음/ set은 중복이 불가능하기 때문)
        set.add("Apple");

        //요소 순회
        for (String s : set) {
            System.out.println(s);
        }
        // 특정 요소 포함 여부 확인
        if(set.contains("Banana")){
            System.out.println("Banana is in the set");
        }

        // 요소 삭제
        set.remove("Apple");

        //집합의 크기
        System.out.println("Set size:" + set.size());
    }
}
