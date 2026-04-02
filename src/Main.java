public class Main {
    public static void main(String[] args) {
        Ksiazka k1 = new Ksiazka("Wiedzmin", "Andrzej Sapkowski", 320, true);
        Ksiazka k2 = new Ksiazka("Lalka", "Boleslaw Prus", 680, true);
        Ksiazka k3 = new Ksiazka("Pan Tadeusz", "Adam Mickiewicz", 340, true);

        Czytelnik c1 = new Czytelnik("Jan", "Kowalski", 1001, 0);
        Czytelnik c2 = new Czytelnik("Anna", "Nowak", 1002, 0);

        k1.wypiszInfo();
        k2.wypiszInfo();
        k3.wypiszInfo();

        c1.wypiszDane();
        c2.wypiszDane();
    }
}