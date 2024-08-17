package collection.set.member;

/**
 * hashCode(), equals() 둘다 오버라이딩 하지 않은 경우
 */

public class MemberNoHashNoEq {

    private String id;

    public MemberNoHashNoEq(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberNoHashNoEq{" +
                "id='" + id + '\'' +
                '}';
    }
}
