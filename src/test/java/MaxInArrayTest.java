import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.Stream;

public class MaxInArrayTest {

    @Test()
    @Description("TestNG")
    public void testMaxInArray() {

        double[] array1 = {1.1, 2.2, 8.8, 9.0};
        double[] array2 = {3.3, 4.4, 4.8, 12.0};
        double[] expectedResult = {12.0, 9.0, 4.8, 8.8};

        Arrays.sort(expectedResult);

        double[] actualResult = MaxInArray.maxInArray(array1, array2);

        Assert.assertEquals(actualResult, expectedResult);

    }

        private static Stream<Arguments> maxInArrayProvider() {

            return Stream.of(
                    Arguments.of(new double[] {1.1, 2.2, 8.8, 9.0}, new double[] {3.3, 4.4, 4.8, 12.0}, new double[]{12.0, 9.0, 4.8, 8.8}),
                    Arguments.of(new double[] {1.1}, new double[] {3.3, 4.4, 4.8, 12.0}, new double[]{}),
                    Arguments.of(new double[] {}, new double[] {}, new double[]{})
            );
        }

        @ParameterizedTest
        @MethodSource("maxInArrayProvider")
        public void testMaxInArrayUp(double[] array1, double[] array2, double[] expectedResult) {

            Arrays.sort(expectedResult);
            double[] actual = MaxInArray.maxInArray(array1, array2);

            Assertions.assertArrayEquals(expectedResult, actual);
        }
    }