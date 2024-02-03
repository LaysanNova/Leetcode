import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SingleNumberTest {

    private static Stream<Arguments> singleNumberProvider() {
        return Stream.of (
                Arguments.of(new int[] {2,2,1}, 1),
                Arguments.of(new int[] {4,1,2,1,2}, 4),
                Arguments.of(new int[] {1}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("singleNumberProvider")
    public void testAcronym(int[] arr, int expectedResult) {
        int actualResult = new SingleNumber().singleNumber1(arr);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
