import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TwoSumTest {

    @Test
    public void testtwoSum() {

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expectedResult = {0, 1};

        int[] actualResult = new TwoSum().twoSum(nums, target);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> twoSumArgumentProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1}),
                Arguments.of(new int[]{4, 5, 2, 7}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{0, 2, 5}, 6, new int[]{-1, -1}),
                Arguments.of(new int[]{0}, 6, new int[]{}),
                Arguments.of(new int[]{}, 1, new int[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("twoSumArgumentProvider")
    public void testTwoSum(int[] nums, int target, int[] expectedResult) {
        int[] actualResult = new TwoSum().twoSum(nums, target);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
