package OOP_2;

import OOP_1.Month;

public class MonthUtils {

    private static final OOP_1.Month[] january = {OOP_1.Month.JANUARY};
    private static final OOP_1.Month[] months0 = new OOP_1.Month[0];
    private static final OOP_1.Month[] quarter1 = {OOP_1.Month.JANUARY, OOP_1.Month.FEBRUARY, OOP_1.Month.MARCH};
    private static final OOP_1.Month[] quarter2 = {OOP_1.Month.APRIL, OOP_1.Month.MAY, OOP_1.Month.JUNE};
    private static final OOP_1.Month[] quarter3 = new OOP_1.Month[3];

    static {
        quarter3[0] = OOP_1.Month.JULY;
        quarter3[1] = OOP_1.Month.AUGUST;
        quarter3[2] = OOP_1.Month.SEPTEMBER;
    }
    private static final OOP_1.Month[] quarter4 = new OOP_1.Month[3];
    static {
        quarter4[0] = OOP_1.Month.OCTOBER;
        quarter4[1] = OOP_1.Month.NOVEMBER;
        quarter4[2] = OOP_1.Month.DECEMBER;
    }
    static OOP_1.Month[] noun1 = {OOP_1.Month.JANUARY, OOP_1.Month.FEBRUARY, OOP_1.Month.MARCH, OOP_1.Month.APRIL, OOP_1.Month.MAY, OOP_1.Month.JUNE};
    static OOP_1.Month[] noun2 = {OOP_1.Month.JULY, OOP_1.Month.AUGUST, OOP_1.Month.SEPTEMBER, OOP_1.Month.OCTOBER, OOP_1.Month.NOVEMBER, OOP_1.Month.DECEMBER};

    static public OOP_1.Month[] getMonths0() {
        return months0;
    }

    static public OOP_1.Month[] getQuarter1() {
        return quarter1;
    }

    static public OOP_1.Month[] getQuarter2() {
        return quarter2;
    }

    static public OOP_1.Month[] getQuarter3() {
        return quarter3;
    }

    static public OOP_1.Month[] getQuarter4() {
        return quarter4;
    }

    static public OOP_1.Month[] getNoun1() {
        return noun1;
    }

    static public OOP_1.Month[] getNoun2() {
        return noun2;
    }

    static Month[] getJanuary() {
        return january;
    }
}
