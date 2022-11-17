package Day03;

public class C02_FirstTwoLastTwoSame {

    // task: ilk iki harf ve son iki harf aynı mı

    public boolean check_if_first_two_last_two_are_same(String str) {

        String ilkIkiHarf = str.substring(0, 2);
        String sonIkiHarf = str.substring(str.length() - 2);

        if (str.length() <= 1) {
            return false;
        }
        if (str.length() == 2) {
            return true;
        }

        return ilkIkiHarf.equals(sonIkiHarf);
    }
}
