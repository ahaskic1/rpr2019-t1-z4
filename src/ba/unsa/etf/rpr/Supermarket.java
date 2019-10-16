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

    //Getter

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i = 0; i < trenutniBrojArtikala; i++) {
            if(artikli[i].getKod().equals(kod)){
                for(int j = i; j < trenutniBrojArtikala - 1; j++) {
                    Artikl temp = artikli[j];
                    artikli[j] = artikli[j+1];
                    artikli[j+1] = temp;
                }
                trenutniBrojArtikala--;
                break;
            }
        }
        return artikli[trenutniBrojArtikala + 1];
    }
}
