package javaplus.stream;

import java.util.stream.IntStream;

public class Stream3 {
    public static void main(String[] args) {
        //마지막 숫자 포함
        //IntStream = Steram<Integer> --> 박싱을 안해도 되서 편리함
        IntStream intStream = IntStream.rangeClosed(1,10);
        //메서드 지정된 시작값과 끝값 사이의 연속적인 'int' 값들로 구성된 'IntStream'생성
        intStream.forEach(a-> System.out.println(a+" "));
        System.out.println();

        //마지막 숫자 제외
        IntStream intStream2 = IntStream.range(1,10);
        intStream2.forEach(a-> System.out.println(a+ " "));
    }
}
