package list;

import javaex.A;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        //ArrayList 생성
        ArrayList<String> arrayList = new ArrayList<>();

        // 요소 추가
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Melon");
        arrayList.add("Grape");

        //인덱스 접근
        System.out.println("1번 인덱스 : " + arrayList.get(1));

        //요소 삭제
        arrayList.remove("Banana");
        arrayList.remove(0);

        //리스트 출력
        System.out.println("현재 요소: "+ arrayList);

    }
}
