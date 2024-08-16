package collection.set;

public class MyHashSetV0Main {

    public static void main(String[] args) {

        MyHastSetV0 set = new MyHastSetV0();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        // 모두 O(n) 성능
        // add()로 데이터를 추가할 때마다 셋에 전체 데이터를 항상 확인해야 한다.
        // 중복 데이터 검색 : O(n)
        // 데이터 입력: O(1)
        System.out.println(set);

        boolean result = set.add(4);
        System.out.println("중복 데이터 저장 결과 = " + result);
        System.out.println(set);

        System.out.println("set.contains(3) = " + set.contains(3)); // O(n)
        System.out.println("set.contains(99) = " + set.contains(99)); // O(n)
    }
}
