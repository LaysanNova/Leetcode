import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class AnagramTest {
    private static Stream<Arguments> anagramProvider() {
        return Stream.of(
                Arguments.of("mama", "amma", true),
                Arguments.of("mamam", "ammaa", false),
                Arguments.of("mamas", "samma", true),
                Arguments.of("mam", "a", false)
        );
    }

    @ParameterizedTest
    @MethodSource("anagramProvider")
    public void testAnagram(String str1, String str2, boolean expectedResult) {
        boolean actualResult = new Anagram().isAnagram(str1, str2);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
