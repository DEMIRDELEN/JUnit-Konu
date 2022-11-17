package Day01;

import org.junit.jupiter.api.Test;

import java.security.PublicKey;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day01Test02_Assertions2 {

    @Test
    public void testToFindMin() {
        assertTrue(Math.min(4, 10) == 4);
        assertFalse(Math.min(4, 10) == 10);
    }

    @Test
    public void testArrays() {
        String str = "test islemi cok kolay";
        String[] anlikDizi = str.split(" ");
        String[] beklenenDizi = {"test", "islemi", "cok", "kolay"};
        assertTrue(Arrays.equals(beklenenDizi, anlikDizi));
    }
}
