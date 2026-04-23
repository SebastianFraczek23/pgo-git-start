public class KlientKawiarni {
    private int idKlienta;
    private String imie;
    private String nazwisko;
    private String email;

    public KlientKawiarni(int idKlienta, String imie, String nazwisko, String email) {
        this.idKlienta = idKlienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }

    public String pobierzPelneDane() {
        return imie + " " + nazwisko + " (" + email + ")";
    }

    public int getIdKlienta() {
        return idKlienta;
    }

    @Override
    public String toString() {
        return "Klient: " + imie + " " + nazwisko + ", email: " + email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof KlientKawiarni)) return false;

        KlientKawiarni k = (KlientKawiarni) obj;
        return this.idKlienta == k.idKlienta;
    }
}