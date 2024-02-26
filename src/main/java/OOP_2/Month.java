package OOP_2;

public enum Month {
    JANUARY(18),
    FEBRUARY(20),
    MARCH(21),
    APRIL(22),
    MAY(21),
    JUNE(21),
    JULY(22),
    AUGUST(22),
    SEPTEMBER(21),
    OCTOBER(21),
    NOVEMBER(21),
    DECEMBER(21);

    private final int numOfDays;

    Month(int numOfDays){
        this.numOfDays = numOfDays;
    }

    public int getNumOfDays(){

        return numOfDays;
    }
}
