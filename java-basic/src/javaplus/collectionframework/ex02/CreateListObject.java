package javaplus.collectionframework.ex02;

import java.util.*;

public class CreateListObject {
    public static void main(String[] args) {
        //#1. 방법1. List 구현 클래스의 생성자를 사용하여 객체 생성
        List<Integer> aList1 = new ArrayList<>(); //capacity = 10
        List<Integer> aList2 = new ArrayList<>(30); //size()와는 전혀 다른 것


        List<Integer> aList3 = new Vector<>(); //capacity = 10
        List<Integer> aList4 = new Vector<>(30); //size()와는 전혀 다른 것


        List<Integer> aList5 = new LinkedList<>(); //capacity = 10
//        List<Integer> aList6 = new LinkedList<>(30); //LinkedList는 저장용량을 지정하는 생성자 없음

        //#방법2. Arrays 클래스의 정적 메서드 활용 (데이터의 크기를 바꿀 수 없다.)
        List<Integer> aList7 = Arrays.asList(1,2,3,4);
        List<String> aList8 = Arrays.asList("방가","안녕");
        aList7.set(1, 7);
        aList8.set(0, "감사");
//        aList7.add(5); 배열은 추가할 수 없다.
//        aList8.remove(0); 배열은 삭제할 수 없다.
        System.out.println(aList7);
        System.out.println(aList8);


    }
}
