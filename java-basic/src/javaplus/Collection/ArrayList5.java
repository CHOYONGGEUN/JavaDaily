package javaplus.Collection;

import java.lang.reflect.Array;
import java.util.*;
public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);
        //sub = list1.subLIst(1,4); -> sub은 읽기만 가능 [4,2,0]
        ArrayList list2 = new ArrayList(list1.subList(1,4));
        print(list1,list2);

        Collections.sort(list1); //정렬
        Collections.sort(list2);
        print(list1,list2);

        System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3,"A");//번의 위치에 "A"를 배치, B,C는 한칸씩 밀림
        print(list1,list2);

        //list2에서 list1에 포함된 객체들을 삭제한다.
        for(int i = list2.size() -1; i >=0; i--){
            if(list1.contains(list2.get(i))){
                list2.remove(i);
            }
        }
        print(list1,list2);
    }
    static void print(ArrayList list1, ArrayList list2){
        System.out.println("list1: " +list1);
        System.out.println("list2: " +list2);
        System.out.println();
    }
}
