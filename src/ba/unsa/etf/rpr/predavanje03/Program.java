package ba.unsa.etf.rpr.predavanje03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Program {

    public static void main(String[] args) {
        Predmet p = new Predmet("CN", 7, 10);
        Student s = new Student("Pepa", "Pig", 0);
        Student s1 = new Student("Sarita", "Zulum", 18175);
        p.upisi(s);
        p.upisi(s1);
        p.ispisi(s1);
        p.ispisi();
    }
}

