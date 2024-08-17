package collection.set.member;

import collection.set.MyHastSetV2;

public class HasnAndEqualsMain2 {

    public static void main(String[] args) {
        // 중복 등록
        MyHastSetV2 set = new MyHastSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        // 검색 실패
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
