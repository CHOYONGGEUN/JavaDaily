package javaplus.reference;

import java.util.Arrays;

public class FlexibleSizeArrayArgument {

    public static void main(String[] args) {
        //#1.
        method1(1, 2);
        method1(1,2,3);
        method1();

        //#2.
        method2("안녕", "방가");
        method2("안녕", "방가","땡큐");
        method2();
    }


    public static void method1(int...values){ //가변길이 배열
        System.out.println("배열의 길이: " + values.length);
//        for(int i = 0; i < values.length; i++){
//            System.out.println(values[i] + " ");
//        }
//        System.out.println(Arrays.toString(values));
//        System.out.println();
        for (int i : values) {
            System.out.println(i + " ");

        }

    }
    public static void method2(String...values){
        System.out.println("배열의 길이: " + values.length);
        for (String j : values) {
            System.out.println(j + " ");
        }
    }

    }
//    public static void method1(){
//
//
//    }
//    public static void method1(int a , int b){
//
//    }
//    public static void method1(int a, int b, int c){
//
//    }


