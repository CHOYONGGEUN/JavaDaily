package list;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        //LinkedList 생성
        LinkedList<String> linkedList = new LinkedList<>();

        //요소 추가
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.addFirst("Melon");//리스트의 시작 요소로 추가
        linkedList.add("Orange");// 리스틔 마지막 요소로 추가

        //인덱스 접근
        System.out.println("1번 인덱스: " + linkedList.get(1));

        // 요소 삭제
        linkedList.removeFirst(); //리스트 첫번째 요소 삭제
        linkedList.removeLast(); //리스트 마지막 요소 삭제

        //리스트 출력
        System.out.println("현재 요소: " + linkedList);

    }
}
