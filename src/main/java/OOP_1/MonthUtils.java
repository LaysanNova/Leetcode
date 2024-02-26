package OOP_1;

public class MonthUtils {

    private static final Month[] january = {Month.JANUARY};
    private static final Month[] months0 = new Month[0];
    private static final Month[] quarter1 = {Month.JANUARY, Month.FEBRUARY, Month.MARCH};
    private static final Month[] quarter2 = {Month.APRIL, Month.MAY, Month.JUNE};
    private static final Month[] quarter3 = new Month[3];

    static {
        quarter3[0] = Month.JULY;
        quarter3[1] = Month.AUGUST;
        quarter3[2] = Month.SEPTEMBER;
    }
    private static final Month[] quarter4 = new Month[3];
    static {
        quarter4[0] = Month.OCTOBER;
        quarter4[1] = Month.NOVEMBER;
        quarter4[2] = Month.DECEMBER;
    }
    static Month[] noun1 = {Month.JANUARY, Month.FEBRUARY, Month.MARCH, Month.APRIL, Month.MAY, Month.JUNE};
    static Month[] noun2 = {Month.JULY, Month.AUGUST, Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER};

    static public Month[] getMonths0() {
        return months0;
    }

    static public Month[] getQuarter1() {
        return quarter1;
    }

    static public Month[] getQuarter2() {
        return quarter2;
    }

    static public Month[] getQuarter3() {
        return quarter3;
    }

    static public Month[] getQuarter4() {
        return quarter4;
    }

    static public Month[] getNoun1() {
        return noun1;
    }

    static public Month[] getNoun2() {
        return noun2;
    }

    static Month[] getJanuary() {
        return january;
    }
}
