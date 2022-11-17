package Day03;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C02FirstTwoLastTwoSameTest {

    C02_FirstTwoLastTwoSame obj1 = new C02_FirstTwoLastTwoSame();

    @ParameterizedTest
    @CsvSource(value = {"true,ABAB", "false,ABBA", "true,AB"})
    void check_If_First_Two_Last_Two_Are_Same_Test1(boolean rs, String str, TestInfo Info) {
        assertEquals(rs, obj1.check_if_first_two_last_two_are_same(str));
    }
}
