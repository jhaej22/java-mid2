package collection.compare;

import java.util.Arrays;

public class SortMain1 {

    public static void main(String[] args) {
        Integer[] arr = {3, 2, 1};
        System.out.println(Arrays.toString(arr));

        System.out.println("기본 정렬 후");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

// Arrays.sort()메서드를 사용하면 배열에 들어있는 데이터를 순서대로 정렬할 수 있음
