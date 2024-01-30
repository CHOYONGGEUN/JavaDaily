package javaplus.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysStreamEx {
    public static void main(String[] args) {
        int[]numbers = {1,2,3,4,5};

        //int[] 배열을 IntStream으로 변환
        IntStream stream = Arrays.stream(numbers);

        //스트림을 사용해서 연산 수행
        stream.forEach(System.out::println);
    }
}
