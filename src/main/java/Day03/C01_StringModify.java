package Day03;

public class C01_StringModify {


    public String deleteAIfITIsInFirstIntoPosition(String str) {

        //Task: Kelimenin ilk iki harfinde A varsa silinsin
        //      kelime içindeki harflerin hepsi büyük olacak.

        if (str.length() <= 2) {
            return str.replace("A", "");
        }

        String ilkİkiHarf = str.substring(0, 2);
        String geriKalanHarf = str.substring(2);

        return ilkİkiHarf.replace("A", "") + geriKalanHarf;
    }
}
