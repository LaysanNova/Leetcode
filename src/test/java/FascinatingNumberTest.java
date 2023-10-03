import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class FascinatingNumberTest {

    private static Stream<Arguments> fascinatingNumberProvider() {
        return Stream.of(
                Arguments.of(192, true),
                Arguments.of(100, false),
                Arguments.of(111, false),
                Arguments.of(783, false)
        );
    }

    @ParameterizedTest
    @MethodSource("fascinatingNumberProvider")
    public void testFascinatingNumber(int number, boolean expectedResult) {
        boolean actualResult = new FascinatingNumber().numberIsFascinating(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
