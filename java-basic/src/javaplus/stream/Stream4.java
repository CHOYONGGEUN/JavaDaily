package javaplus.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream4 {
    static List<Integer> largeNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
            .parallelStream() // 병렬 스트림 생성
            .filter(n -> n > 5) // 조건 필터링
            .collect(Collectors.toList()); // 결과 수집

    public static void main(String[] args) {
        System.out.println(largeNumbers); // 출력 예: [6, 7, 8, 9, 10]

    }

}
