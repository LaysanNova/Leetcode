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


//    public static void main(String[] args) {
//
//        List<String> messages = Arrays.asList("Hello", "World!", "How", "Are", "You");
//
//        System.out.println(acronym1(Arrays.asList("alice","bob","charlie"), "abc"));
//        System.out.println(acronym2(List.of("alice","bob","charlie"), "abc"));
//        System.out.println(acronym3(Arrays.asList("alice","bob","charlie"), "abc"));
//        System.out.println(acronym4(Arrays.asList("alice","bob","charlie"), "abc"));
//
//        System.out.println(acronym1(List.of("an","apple"), "a"));
//        System.out.println(acronym2(Arrays.asList("an","apple"), "a"));
//        System.out.println(acronym3(Arrays.asList("an","apple"), "a"));
//        System.out.println(acronym4(Arrays.asList("an","apple"), "a"));
//
//        System.out.println(acronym1(Arrays.asList("never","gonna","give","up","on","you"), "ngguoy"));
//        System.out.println(acronym2(Arrays.asList("never","gonna","give","up","on","you"), "ngguoy"));
//        System.out.println(acronym3(Arrays.asList("never","gonna","give","up","on","you"), "ngguoy"));
//        System.out.println(acronym4(List.of("never","gonna","give","up","on","you"), "ngguoy"));
//
//    }
