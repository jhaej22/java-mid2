package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2_2 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));
        // 배열을 set에 입력할 때 직접 배열을 반복하는 것보다 간단한 방법
        // Set 구현체의 생성자에 배열을 전달할 순 없지만 리스트는 전달할 수 있음

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
