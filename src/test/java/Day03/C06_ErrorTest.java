package Day03;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class C06_ErrorTest {
    @Test
    void test() {
        C06_Error testobj = mock(C06_Error.class);
        testobj.divide(5, 0);
    }
}
