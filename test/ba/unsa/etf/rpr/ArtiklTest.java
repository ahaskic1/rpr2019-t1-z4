package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {
    Artikl artikl = new Artikl("sat", 1 ,"115");
    @Test
    void getNaziv() {
        assertAll("", () -> {artikl.getNaziv().equals("sat");});
    }

    @Test
    void getCijena() {
        assertAll("", () -> {assertEquals(artikl.getCijena(),1);});
    }

    @Test
    void getKod() {
        assertAll("", () -> {artikl.getKod().equals("115");});
    }
}