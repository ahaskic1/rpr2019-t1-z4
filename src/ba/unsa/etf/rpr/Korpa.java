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
        Artikl vrati = new Artikl();
        for(int i = 0; i < trenutniBrojArtikala; i++) {
            if(artikli[i].getKod().equals(kod)){
                for(int j = i; j < trenutniBrojArtikala - 1; j++) {
                    Artikl temp = artikli[j];
                    artikli[j] = artikli[j+1];
                    artikli[j+1] = temp;
                }
                vrati = artikli[trenutniBrojArtikala - 1];
                artikli[trenutniBrojArtikala - 1] = null;
                trenutniBrojArtikala--;
                break;
            }
        }
        return vrati;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for(int i = 0; i < trenutniBrojArtikala; i++) {

            suma += artikli[i].getCijena();
        }
        return suma;
    }
}
