package Day01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day01Test03_BeforeEach_AfterEach {
    String str;

    @BeforeEach
    void beforeEach() {
        str = "Junit5 is better than Junit4";
        System.out.println("beforeEach() çalıştı.");
    }

    @AfterEach
    void afterEach() {
        str = null;
        System.out.println("afterEach() çalıştı.");
    }

    @Test
    void testArray(TestInfo info) { // hangi task in çalıştığını anlamak için parametre girildi.
        String[] anlikDizi = str.split(" ");
        String[] beklenenDizi = {"Junit5", "is", "better", "than", "Junit4"};
        System.out.println(info.getDisplayName() + " çalıştı.");

        assertTrue(Arrays.equals(beklenenDizi, anlikDizi));
    }

    // farklı örnek

    @Test
    void testStringLength(TestInfo info) {
        int anlikDeger = str.length();
        int beklenenDeger = 28;
        assertEquals(beklenenDeger, anlikDeger);
        System.out.println(info.getDisplayName() + " çalişti.");
    }
}
