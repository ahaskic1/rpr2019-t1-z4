package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    Supermarket supermarket = new Supermarket();
    Artikl artikl = new Artikl("olovka", 1, "100");

    @Test
    void dodajArtikl() {
        supermarket.dodajArtikl(artikl);
        assertAll("", () -> {supermarket.getArtikli()[0].equals(artikl);});
    }

    @Test
    void getArtikli() {
    }

    @Test
    void izbaciArtiklSaKodom() {
        supermarket.dodajArtikl(artikl);
        assertAll("", () -> {supermarket.izbaciArtiklSaKodom("100").equals(artikl);});
    }
}