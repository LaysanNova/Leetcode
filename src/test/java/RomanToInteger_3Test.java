import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class RomanToInteger_3Test {

    private static Stream<Arguments> romanToIntegerArgumentsProvider() {
        return Stream.of(
                Arguments.of("III", 3),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994),
                Arguments.of("", 0),
                Arguments.of("YTMRU", 0),
                Arguments.of("XXVII", 27),
                Arguments.of("YTRU", 0),
                Arguments.of("III", 3),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994),
                Arguments.of("I", 1),
                Arguments.of("II", 2),
                Arguments.of("MMMCMXCVIII", 3998),
                Arguments.of("MMMCMXCIX", 3999),

                Arguments.of("", 0),
//                Arguments.of("IV", -2147483648),                  //4000 or 0
                Arguments.of("MMMCMXCIXMMMCMXCIXMMMCMXCIX", 0),
                Arguments.of("MCQIX", 0),
                Arguments.of("ZCIX", 0),
                Arguments.of("", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("romanToIntegerArgumentsProvider")
    public void romanToIntegerTest(String romanDigits, int expectedNumber) {

        int actualNumber = new RomanToInteger_3().romanToInt(romanDigits);
        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void testRomanToInteger() {

        String latNumber = "III";
        int expectedNumber = 3;

        int actualNumber = new RomanToInteger().romanToInt(latNumber);
        Assertions.assertEquals(expectedNumber, actualNumber);
    }
}
