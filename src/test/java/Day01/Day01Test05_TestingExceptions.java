package Day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Day01Test05_TestingExceptions {

    //test ettiğimiz method beklediğimiz exception fırlattı mı?

    @Test
    void testException() {
        String str = "Merhaba Dünya";

        assertThrows(NullPointerException.class, () -> {
            System.out.println("testException is run");
            str.length();
        });
    }

    @Test
    void testException2() {
        int sayi1 = 1;
        int sayi2 = 0;
        assertThrows(RuntimeException.class/*ArithmeticException.class*/, () -> {
            System.out.println(sayi1 / sayi2);
        });
    }

    // yukarıdaki soruyu method ekleyerek yapalım
    @Test
    void testException3() {
        int sayi1 = 1;
        int sayi2 = 0;

        assertThrows(ArithmeticException.class, () -> {
            divide(sayi1, sayi2);
        });
    }
    private int divide(int a, int b) {
        return a / b;
    }

}
