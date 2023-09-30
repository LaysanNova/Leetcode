import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RomanToIntegerTest {

    @Test
    public void testRomanToInteger() {
        //AAA
        //A - arrange
        String latNumber = "III";
        int expectedNumber = 3;

        //A - act
        int actualNumber = new RomanToInteger().romanToInt(latNumber);
        //A - assert
        Assertions.assertEquals(expectedNumber, actualNumber);
    }
}
