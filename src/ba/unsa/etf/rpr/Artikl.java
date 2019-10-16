package ba.unsa.etf.rpr;

public class Artikl {
    private String nazivArtikla;
    private int cijenaArtikla;
    private String kodArtikla;

    //Constructor

    public Artikl(String nazivArtikla, int cijenaArtikla, String kodArtikla) {
        this.nazivArtikla = nazivArtikla;
        this.cijenaArtikla = cijenaArtikla;
        this.kodArtikla = kodArtikla;
    }

    //Getters

    public String getNazivArtikla() {
        return nazivArtikla;
    }

    public int getCijenaArtikla() {
        return cijenaArtikla;
    }

    public String getKodArtikla() {
        return kodArtikla;
    }
}
