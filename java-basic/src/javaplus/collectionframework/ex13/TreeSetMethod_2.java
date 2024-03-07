package javaplus.collectionframework.ex13;

import java.util.Comparator;
import java.util.TreeSet;


class MyClass{
    int data1;
    int data2;

    public MyClass(int data1, int data2) {
        this.data1 = data1;
        this.data2 = data2;
    }
}

class MyClass2 implements Comparable<MyClass2>{
    int data1;
    int data2;

    public MyClass2(int data1, int data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    @Override
    public int compareTo(MyClass2 o) {

        if(data1 < o.data1)
            return -1;
        else if(data1 == o.data2)
            return 0;
        else return 1;
    }
}

public class TreeSetMethod_2 {
    public static void main(String[] args) {
        //#1. Integer 크기 비교
        TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
        Integer intValue1 = (20);
        Integer intValue2 = (10);
        treeSet1.add(intValue1);
        treeSet1.add(intValue2);
        System.out.println(treeSet1);

        //#2. String 크기 비교
        TreeSet<String> treeSet2 = new TreeSet<>();
        String str1 = "가나";
        String str2 = "다라";
        treeSet2.add(str1);
        treeSet2.add(str2);
        System.out.println(treeSet2);

//        #3. MyClass 객체 크기 비교
        TreeSet<MyClass2> treeSet4 = new TreeSet<MyClass2>();
        MyClass2 myComparableClass1 = new MyClass2(2,5);
        MyClass2 myComparableClass2 = new MyClass2(3,3);
        treeSet4.add(myComparableClass1);
        treeSet4.add(myComparableClass2);

        for (MyClass2 i : treeSet4) {
            System.out.println(i.data1);
        }

        //#5. MyClass 객체 크기 비교
        TreeSet<MyClass2> treeSet = new TreeSet<>(new Comparator<MyClass2>() {
            @Override
            public int compare(MyClass2 o1, MyClass2 o2) {
                if(o1.data1 < o2.data1)
                    return -1;
                else if(o1.data1 == o2.data2)
                    return 0;
                else return 1;
            }

        });

        MyClass2 myClass1 = new MyClass2(2,5);
        MyClass2 myClass2 = new MyClass2(3,3);
        treeSet4.add(myClass1);
        treeSet4.add(myClass2);
        for (MyClass2 myClass : treeSet4) {
            System.out.println(myClass.data1);
        }

    }
}
