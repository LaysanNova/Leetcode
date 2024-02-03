import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MissingNumberTest {

    private static Stream<Arguments> missingNumbersProvider() {
        return Stream.of (
                Arguments.of(new int[] {3,0,1}, 2),
                Arguments.of(new int[] {0,1}, 2),
                Arguments.of(new int[] {9,6,4,2,3,5,7,0,1}, 8)
        );
    }

    @ParameterizedTest
    @MethodSource("missingNumbersProvider")
    public void testMissingNumbers(int[]nums, int expectedResult) {

        int actualResult = new MissingNumber().missingNumber(nums);
        Assertions.assertEquals(expectedResult, actualResult);

        int actualResult1 = new MissingNumber().missingNumber1(nums);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
