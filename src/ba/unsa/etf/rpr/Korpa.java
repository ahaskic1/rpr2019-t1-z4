package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli;
    private  int trenutniBrojArtikala;

    //Constructor

    public Korpa() {
        artikli = new Artikl[50];
        trenutniBrojArtikala = 0;
    }

    public boolean dodajArtikl(Artikl a) {
        if(trenutniBrojArtikala >= 50)
            return false;
        artikli[trenutniBrojArtikala] = a;
        trenutniBrojArtikala++;
        return true;
    }
}
