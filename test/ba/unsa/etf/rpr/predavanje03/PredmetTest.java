package ba.unsa.etf.rpr.predavanje03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void getMax_broj_studenata() {
    }

    @Test
    void getNaziv_predmeta() {
    }

    @Test
    void getNiz_studenata() {
    }

    @Test
    void getSifra_predmeta() {
    }

    @Test
    void setNaziv_predmeta() {
    }

    @Test
    void setNiz_studenta() {
    }

    @Test
    void setSifra_predmeta() {
    }

    @Test
    void upisi() {
        Predmet p = new Predmet("CN",7, 10);
        Student s = new Student("Pepa", "Pig", 0);
        p.upisi(s);
        assertEquals("Pig Pepa (0)", p[0].toString());
    }

    @Test
    void ispisi() {
        Predmet p = new Predmet("CN",7, 10);
        Student s = new Student("Pepa", "Pig", 0);
        p.upisi(s);
        p.ispisi(s);
        assertEquals(null, p[0].toString());
    }

    @Test
    void ispisi1() {
    }
}