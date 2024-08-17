package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {

    public static void main(String[] args) {
        // Object의 기본 hashCode는 객체의 참조값을 기반으로 생성
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());
        // obj1, obj2는 결과적으로 다른 해시 코드를 반환

        // 기본 클래스들은 이미 hashCode()를 이미 오버라이딩 해둠
        // 데이터의 값이 같으면 같은 해시코드 반환, 다른 데이터 값이면 다른 해시코드를 반환
        Integer i1 = 10;
        Integer i2 = 10;
        String strA = "A";
        String strAB = "AB";
        System.out.println("i1.hashCode() = " + i1.hashCode());
        System.out.println("i2.hashCode() = " + i2.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("strAB.hashCode() = " + strAB.hashCode());

        // hashCode는 마이너스 값이 될 수 있음
        // hasCode의 경우 정수를 반환하기 때문에
        System.out.println("-1.hashCode() = " + Integer.valueOf(-1).hashCode());

        // 둘은 같을까? 다를까? -> 인스턴스(참조값)은 다르지만, equals는 같음
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        System.out.println("member1 == member2 : " + (member1 == member2));
        System.out.println("member1 equals member2 = " + member1.equals(member2));
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
    }
}
