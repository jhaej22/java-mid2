package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HastStart5 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9);
        System.out.println("buckets = " + Arrays.toString(buckets));

        // 검색
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("contains = " + contains);
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hasIndex = hasIndex(value);
        LinkedList<Integer> bucket = buckets[hasIndex];
        if (!bucket.contains(value)) {
            bucket.add(value);
        } // set은 데이터가 중복되면 안되므로
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hasIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }
    static int hasIndex(int value) {
        return value % CAPACITY;
    }
}
