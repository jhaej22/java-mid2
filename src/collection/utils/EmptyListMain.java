package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EmptyListMain {

    public static void main(String[] args) {
        // 빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        // 원하는 컬렉션의 구현체를 직접 생성하면 된다.

        // 빈 불변 리스트 생성
        List<Integer> list3 = Collections.emptyList(); // java 5
        List<Integer> list4 = List.of(); // java 9 -> 이 방법 추천

        System.out.println("list3.getClass() = " + list3.getClass());
        System.out.println("list4.getClass() = " + list4.getClass());
    }
}
