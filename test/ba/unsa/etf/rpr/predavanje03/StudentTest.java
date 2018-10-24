package ba.unsa.etf.rpr.predavanje03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getBroj_indeksa() {

    }

    @Test
    void getIme() {
    }

    @Test
    void getPrezime() {
    }

    @Test
    void setBroj_indeksa() {
        this.setBroj_indeksa(18175);
        assertEquals("18175", (this.getBroj_indeksa()).toString());
    }

    @Test
    void setPrezime() {
    }

    @Test
    void setIme() {
    }
}