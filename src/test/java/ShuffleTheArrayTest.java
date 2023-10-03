import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class ShuffleTheArrayTest {

    private static Stream<Arguments> shuffleTheArrayProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 5, 1, 3, 4, 7}, 3, new int[]{2,3,5,4,1,7}),
                Arguments.of(new int[]{1,2,3,4,4,3,2,1}, 4, new int[]{1,4,2,3,3,2,4,1}),
                Arguments.of(new int[]{1,1,2,2}, 2, new int[]{1,2,1,2})
        );
    }

    @ParameterizedTest
    @MethodSource("shuffleTheArrayProvider")
    public void testShuffleTheArray(int[] nums, int n,int[] expectedResult) {
        int[] actualResult = new ShuffleTheArray().shuffle(nums, n);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
