package collection.compare;

import java.util.Arrays;

public class SortMain3 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        MyUser[] members = {myUser1, myUser2, myUser3};

        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(members));

        System.out.println("Comparable 기본 정렬");
        Arrays.sort(members); // 자연 순서 (Comparble을 통해 정렬)
        System.out.println(Arrays.toString(members));

        // 추가
        System.out.println("IDComparator 정렬");
        Arrays.sort(members, new IdComparator());
        System.out.println(Arrays.toString(members));

        System.out.println("IdComparator().reversed() 정렬");
        Arrays.sort(members, new IdComparator().reversed());
        System.out.println(Arrays.toString(members));
    }
}
