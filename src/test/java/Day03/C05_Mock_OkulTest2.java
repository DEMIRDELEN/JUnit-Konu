package Day03;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class C05_Mock_OkulTest2 {

    @Test
    void islemler() {
        C05_Mock_Islemler dummy = mock(C05_Mock_Islemler.class);
        dummy.ekleOgrenci("ali");
        dummy.guncelleOgrenci("veli");

        verify(dummy).guncelleOgrenci("veli");
        verify(dummy).ekleOgrenci("ali");
    }
}