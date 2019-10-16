package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli;
    private  int trenutniBrojArtikala;

    //Constructor

    public Korpa() {
        artikli = new Artikl[50];
        trenutniBrojArtikala = 0;
    }

    //Getter

    public Artikl[] getArtikli() {
        return artikli;
    }

    public boolean dodajArtikl(Artikl a) {
        if(trenutniBrojArtikala >= 50)
            return false;
        artikli[trenutniBrojArtikala] = a;
        trenutniBrojArtikala++;
        return true;
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
