package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private int cijena;
    private String kod;

    //Constructor

    public Artikl(String nazivArtikla, int cijenaArtikla, String kodArtikla) {
        this.naziv = nazivArtikla;
        this.cijena = cijenaArtikla;
        this.kod = kodArtikla;
    }

    public Artikl() {
    }

    //Getters

    public String getNaziv() {
        return naziv;
    }

    public int getCijena() {
        return cijena;
    }

    public String getKod() {
        return kod;
    }
}
