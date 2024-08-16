package collection.set;

import java.util.Arrays;

public class HastStart2 {

    public static void main(String[] args) {

        Integer[] inputArray = new Integer[10];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));
        // 데이터 값 자체를 인덱스로 활용
        // 데이터 값을 검색할 때의 성능: O(n) -> O(1)

        int searchValue = 8;
        Integer result = inputArray[searchValue];
        System.out.println(result);
    }
}
