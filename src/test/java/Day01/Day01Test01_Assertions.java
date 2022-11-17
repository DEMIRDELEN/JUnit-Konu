package Day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day01Test01_Assertions {

    @Test
    public void test() {
        //main methodu yokken nasıl çalıştı?
        // Junit içinde gömülü main methodu var ve çalıştı.
        // class boş olduğu için test geçti.
    }

    @Test
    public void testLength() {

        String cumle = "merhaba dünyam"; // 14 karakter
        int anlikDeger = cumle.length();
        int beklenenDeger = 14;
        //assertEquals(beklenenDeger, anlikDeger);
        //testim hata verdiğinde mesaj vermek istiorsam
        assertEquals(beklenenDeger, anlikDeger, "Uzunluklar uyuşmadı");
    }

    @Test
    public void testUpperCase() {
        String anlikDeger = "Merhaba".toUpperCase();
        String beklenenDeger = "MERHABA";
        assertEquals(beklenenDeger, anlikDeger, "UpperCase methodu düzgün çalışmıyor.");
    }

    // TOPLAMA İŞLEMİ

    @Test
    public void testToplama() {
        int sayi1 = 10;
        int sayi2 = 5;

        int anlikDeger = Math.addExact(sayi1, sayi2);
        int beklenenDeger = 15;

        assertEquals(beklenenDeger, anlikDeger, "toplam degeri yanlis");
    }

    //contains() test edelim

    @Test
    public void testContains() {
        assertEquals(false, "mirac".contains("z"), "boolean yanlıs");
    }
}
