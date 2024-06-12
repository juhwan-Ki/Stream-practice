package com.mangkyu.stream.Quiz3;

import org.apache.commons.lang3.text.WordUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz3 {

     static final List<Integer> numbers1 = Arrays.asList(1, 2, 3);
     static final List<Integer> numbers2 = Arrays.asList(3, 4);

    // 3.1 모든 숫자 쌍의 배열 리스트를 반환하여라.
    // ex) numbers1 = [1,2,3], numbers2 = [3,4] -> [(1,3), (1,4), (2,3), (2,4), (3,3), (3,4)]
    public List<Integer[]> quiz1() {
        return numbers1.stream()
                .flatMap(num1 -> numbers2.stream().map(num2 -> new Integer[]{ num1, num2 }))
                .collect(Collectors.toList());
    }

    // 3.2 모든 숫자 쌍의 곱이 가장 큰 값을 반환하여라.
    // ex) numbers1 = [1,2,3], numbers2 = [3,4] -> 12
    public int quiz2() {
        return numbers1.stream()
                .flatMap(num1 -> numbers2.stream().map(num2 -> new Integer[]{ num1, num2 }))
                .mapToInt(arr -> arr[0] * arr[1])
                .max()
                .orElse(0);
    }

}
