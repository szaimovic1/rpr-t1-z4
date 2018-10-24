package ba.unsa.etf.rpr.predavanje03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testKonstruktora(){
        Student s = new Student("Pepa", "Pig", 0);
        assertEquals("Pig Pepa (0)", s.toString());
    }

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
    }

    @Test
    void setPrezime() {
    }

    @Test
    void setIme() {
    }

   // @Test
    //void toString(){
    //}

    @Test
    void ispisi() {

    }
}