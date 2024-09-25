package generic.ex3.test;

import generic.ex3.test.unit.BioUnit;

public class UnitUtil {
    public static <T extends BioUnit> T maxHp(T bio1, T bio2) {
        return bio1.getHp() >= bio2.getHp() ? bio1 : bio2;
    }
}
