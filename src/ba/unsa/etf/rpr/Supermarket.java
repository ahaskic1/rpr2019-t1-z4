package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli;
    private int trenutniBrojArtikala;

    //Constructor

    public Supermarket() {
        artikli = new Artikl[1000];
        trenutniBrojArtikala = 0;
    }

    //Dodavanje novog artikla

    public void dodajArtikl(Artikl artikl) {
        if(trenutniBrojArtikala < 1000) {
            artikli[trenutniBrojArtikala] = artikl;
            trenutniBrojArtikala++;
        }

    }
}
