import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PalindromeNumberTest {

    private static Stream<Arguments> palindromeNumberProvider() {
        return Stream.of (
                Arguments.of(85202581, false),
                Arguments.of(121, true),
                Arguments.of(-121, false),
                Arguments.of(0, true),
                Arguments.of(10, false)
        );
    }

    @ParameterizedTest
    @MethodSource("palindromeNumberProvider")
    public void palindromeNumberNumbers(int nums, boolean expectedResult) {
        Assertions.assertEquals(expectedResult, (boolean)new PalindromeNumber().isPalindrome(nums));
    }

}
