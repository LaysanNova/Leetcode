import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AcronymTest {

    private static Stream<Arguments> acronymArgumentsProvider() {

        return Stream.of (
                Arguments.of(Arrays.asList("alice","bob","charlie"), "abc", true),
                Arguments.of(List.of("an","apple"), "a", false),
                Arguments.of(List.of("never","gonna","give","up","on","you"), "ngguoy", true)
        );
    }

    @ParameterizedTest
    @MethodSource("acronymArgumentsProvider")
    public void testAcronym(List<String> words, String s, boolean expectedResult) {
        boolean actualResult1 = new Acronym().acronym1(words, s);
        Assertions.assertEquals(expectedResult, actualResult1);

        boolean actualResult2 = new Acronym().acronym2(words, s);
        Assertions.assertEquals(expectedResult, actualResult2);
    }
}
