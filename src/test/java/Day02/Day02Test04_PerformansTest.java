package Day02;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Day02Test04_PerformansTest {

    @Test
    void testPrintPerformans() {
        assertTimeout(Duration.ofSeconds(3), () -> IntStream.rangeClosed(1, 100000)).forEach(System.out::println);
    }

    @Test
    void testPrintPerformans2(){
        System.out.println(assertTimeout(Duration.ofSeconds(1), () -> IntStream.rangeClosed(1, 50000)).reduce((t, u) -> t + u)); // Math.addExact(t,u),
    }
}
