package Day03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C01_StringModifyTest {

    C01_StringModify stringModify;

    @BeforeEach
    void setUp() {
        stringModify = new C01_StringModify();
        System.out.println("beforeEach çalıştı.");
    }

    @AfterEach
    void tearDown() {
        stringModify = null;
        System.out.println("afterEach çalıştı.");
    }

    @ParameterizedTest
    @CsvSource(value = {"BC,AABC", "BC, ABC", "BC,BAC"})
    void deleteAIfITIsInFirstIntoPosition(String expected, String param) {
        assertEquals(expected, stringModify.deleteAIfITIsInFirstIntoPosition(param));
        System.out.println("deleteAIfITIsInFirstIntoPosition çalıştı.");
    }
}
