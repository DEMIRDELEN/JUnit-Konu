package Day02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Day02Test01_DisplayName {

    @Test
    @DisplayName("Test parseInt() to check if it is throwing non-digit value")
    void testException(TestInfo info) {
        String str = "merhaba";
        assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt(str);
            System.out.println(info.getDisplayName());
        });

    }
}
