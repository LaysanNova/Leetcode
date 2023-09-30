import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FinalValueTest {
    private static Stream<Arguments> finalValueProvider() {
        return Stream.of(
                Arguments.of(new String[]{"--X", "X++", "X++"}, 1),
                Arguments.of(new String[]{"++X", "++X", "X++"}, 3),
                Arguments.of(new String[]{"X++", "++X", "--X", "X--"}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("finalValueProvider")
    public void testFinalValue(String[] operations, int expectedResult) {

        int actualResult = new FinalValue().finalValueAfterOperations(operations);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}


//
//        System.out.println(finalValueAfterOperations(new String[]{"--X","X++","X++"}));
//                System.out.println(finalValueAfterOperations(new String[]{"++X","++X","X++"}));
//                System.out.println(finalValueAfterOperations(new String[]{"X++","++X","--X","X--"}));
