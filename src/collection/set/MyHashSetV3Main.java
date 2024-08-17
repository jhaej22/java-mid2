package collection.set;

import collection.set.member.Member;

public class MyHashSetV3Main {

    public static void main(String[] args) {

        Myset<String> set = new MyHastSetV3<>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);

        // 검색
        String searchValue = "A";
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
