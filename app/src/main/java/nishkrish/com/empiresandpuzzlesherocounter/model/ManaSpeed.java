package nishkrish.com.empiresandpuzzlesherocounter.model;

public enum ManaSpeed {
    VERY_FAST(0), FAST(1), AVERAGE(2), SLOW(3), VERY_SLOW(4);

    private int value;

    ManaSpeed(int value) {
        this.value = value;
    }

    public int getVal() {
        return this.value;
    }

    public ManaSpeed getManaSpeedForVal(int val) {
        switch (val) {
            case 0:
                return VERY_FAST;
            case 1:
                return FAST;
            case 2:
                return AVERAGE;
            case 3:
                return SLOW;
            default:
                return VERY_SLOW;
        }
    }
}
