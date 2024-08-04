package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class UnitPrinter {

    // 제네릭 메서드
    public static <T extends BioUnit> void printV1(Shuttle<T> t) {
        T unit = t.out();
        System.out.println("이름: " + unit.getName() + ", Hp: " + unit.getHp());
    }

    // 와일드 카드
    public static void printV2 (Shuttle<? extends BioUnit> t) {
        BioUnit unit = t.out();
        System.out.println("이름: " + unit.getName() + ", Hp: " + unit.getHp());
    }
}
