package Day03;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class C05_Mock_OkulTest {

    @Test
    void operasyonlarTest(){

        C05_Mock_Islemler dummyObject = Mockito.mock(C05_Mock_Islemler.class);
        dummyObject.guncelleOgrenci("Ahmet");
        dummyObject.silOgrenci("Mehmet");
        dummyObject.ekleOgrenci("Kasim");
        //methodlar cagirilmis mi kontrol edelim

        verify(dummyObject).ekleOgrenci("Kasim");
        verify(dummyObject).silOgrenci("Mehmet");
        verify(dummyObject).guncelleOgrenci("Ahmet");
    }



    // method kac kere cagrildigini test edelim
    @Test
    void testKacKereCagirildi(){
        C05_Mock_Islemler dummyObject2 = Mockito.mock(C05_Mock_Islemler.class);
        dummyObject2.ekleOgrenci("Ahmet");
        dummyObject2.ekleOgrenci("Ahmet");
        dummyObject2.guncelleOgrenci("Mehmet");
//        dummyObject2.silOgrenci("Ahmet");

        //acaba ahmet parametresi ile ekle ogrenci methodu iki defa cagirildi mi?
        verify(dummyObject2,times(2)).ekleOgrenci("Ahmet");

        // ekleOgrenci() methodunu "Buse" parametresi ile cagrilip cagirilmadigini test ediyorum.
        verify(dummyObject2,times(0)).ekleOgrenci("Buse");

        //herhangi bir parametre ile hic cagirilmayan methodu test etmek istersek
        verify(dummyObject2,never()).silOgrenci(anyString());

        //methodun en az 2 defa cagrildigini test etmek istersek:
        verify(dummyObject2,atLeast(2)).ekleOgrenci("Ahmet");
    }

    //methodlarin cagirilma sirasini test etmek istersem :

    @Test
    void testSiralama(){
        C05_Mock_Islemler dummyObject3 = Mockito.mock(C05_Mock_Islemler.class);

        dummyObject3.ekleOgrenci("Ahmet");
        dummyObject3.ekleOgrenci("Mehmet");
        dummyObject3.silOgrenci("Ahmet");

        //InOrder class siralama icin kullaniliyor

        InOrder inOrder = inOrder(dummyObject3);

        inOrder.verify(dummyObject3).ekleOgrenci("Ahmet");
        inOrder.verify(dummyObject3).ekleOgrenci("Mehmet");
        inOrder.verify(dummyObject3).silOgrenci("Ahmet");


    }

}