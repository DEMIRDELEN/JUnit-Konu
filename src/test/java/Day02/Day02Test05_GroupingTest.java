package Day02;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day02Test05_GroupingTest {

    //amacımız, birbiriyle ilişkili testleri gruplamak, aynı sınıfın içinde
    //2 parametreli test yazarak gruplamak istiyoruz :

    @Nested
            //Math class'inin multiplyExact() method'unu, sifirli veya sifirsiz parametrelerle test etmek
            //icin yazdigim 2 test method'unu @Nested annotation'i ile grupluyorum
    class MultiplyTest {
        @ParameterizedTest
        @CsvSource(value = {"-12,3,-4", "-12,4,-3", "12,-4,-3"})
        void testMultiplyWithNonZero(int rs, int a, int b) {
            assertEquals(rs, Math.multiplyExact(a, b));
        }

        @ParameterizedTest
        @CsvSource(value = {"0,-4,0", "0,4,0", "0,0,4"})
        void testMultiplyWithZero(int rs, int a, int b) {
            assertEquals(rs, Math.multiplyExact(a, b));
        }
    }

    // birinci grup testin sonu

    @Nested
    class AddTest {
        @ParameterizedTest
        @CsvSource(value = {"-1,-4,3", "1,4,-3", "-7,-4,-3"})
        void testAddWithNonZero(int rs, int a, int b) {
            assertEquals(rs, Math.addExact(a, b));
        }

        @ParameterizedTest
        @CsvSource(value = {"9,0,9", "2,2,0", "4,4,0"})
        void testAddWithZero(int rs, int a, int b) {
            assertEquals(rs, Math.addExact(a, b));
        }
    }

    //2. grup testin sonu

}
