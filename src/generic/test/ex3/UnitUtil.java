package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class UnitUtil {

    // 제네릭 메서드
    public static <T extends BioUnit> T maxHp(T t1, T t2) {
        return t1.getHp() > t2.getHp() ? t1 : t2;
    }

}
