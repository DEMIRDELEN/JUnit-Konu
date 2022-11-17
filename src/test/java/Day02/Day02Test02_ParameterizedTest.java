package Day02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import javax.management.ConstructorParameters;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day02Test02_ParameterizedTest {
    @Test
    void testLength() {
        assertTrue("Mirac".length() > 0);
        assertTrue("Tarık".length() > 0);
        assertTrue("Ismail".length() > 0);
        assertTrue("Taha".length() > 0);
    }

    // yukarıdaki methodu daha kolay yazmak için parametreli testler kullanırız.

    @ParameterizedTest
    @ValueSource(strings = {"mirac", "tarık", "ismail", "taha"})
        //Array icerisindekileri arka planda tek tek alarak isleme sokuyor
    void testLength2(String str) {
        assertTrue(str.length() > 0);
    }

    // 2. ornek

    @ParameterizedTest
    @CsvSource(value = {
            "MERHABA, merhaba",
            "TEST, test",
            "JAVA, java"
    })
    void testUpperCase(String str1, String str2) {
        assertEquals(str1, str2.toUpperCase());
    }

    @ParameterizedTest
    @CsvSource(value = {"true, java,a", "true,junit,u", "false,hello,a"})
    void testContains(boolean b, String str1, String str2) {
        assertEquals(b, str1.contains(str2));
    }
}
