package collection.set.member;

import java.util.Objects;

public class Member {

    private String id;

    public Member(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Member member = (Member) object;
        return Objects.equals(id, member.id);
    } // 기본 메서드: 객체의 참조값을 기반으로 비교 (동일성 비교)
      // 오바라이딩한 메서드: id가 같다면 참조값이 달라도 같음 (동등성 비교_

    @Override
    public int hashCode() {
        return Objects.hash(id);
    } // 기존 메서드: 참조값을 기반으로 해시 코드 생성
      // 오버라이딩한 메서드: id값을 기반으로 해시코드 생성

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                '}';
    }
}
