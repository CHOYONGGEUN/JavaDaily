package javaplus.reference;

import java.util.Arrays;

public class ArrayArgumentMethod {
    public static void main(String[] args) {

        //배열을 매개변수로 가지는 메서드 호출
        int[] a = new int[]{1,2,3};
        printArray(a);
//        printArray({1,2,3}); 오류

    }
    public static void printArray(int[] a){

//        int[] a;
//        a = {1, 2, 3}; 이렇게 나눠서 쓰는 것은 불가능하다.
        System.out.println(Arrays.toString(a));

    }
}
