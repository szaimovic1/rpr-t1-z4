package ba.unsa.etf.rpr.predavanje03;

public class Student {
    private String ime;
    private String prezime;
    private int broj_indeksa;

    public Student(String ime) {
        this.ime = ime;
    }
    public Student(int broj_indeksa) {
        this.broj_indeksa = broj_indeksa;
    }

    public int getBroj_indeksa() {
        return broj_indeksa;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setBroj_indeksa(int broj_indeksa) {
        this.broj_indeksa=broj_indeksa;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    class Predmet {
        private String naziv_predmeta;
        private int sifra_predmeta;
        private int max_broj_studenata=0;   //????????
        private Student[] niz_studenata;

        public Predmet(int max_broj_studenata) {
            this.max_broj_studenata = max_broj_studenata; //????
        }

        public Predmet(String naziv_predmeta) { this.naziv_predmeta = naziv_predmeta; }

        public Predmet(Student[] niz_studenata) {
            this.niz_studenata = niz_studenata;       //????
        }

        public int getMax_broj_studenata() {
            return max_broj_studenata;
        }

        public String getNaziv_predmeta() {
            return naziv_predmeta;
        }

        public Student[] getNiz_studenata() {
            return niz_studenata;
        }

        public int getSifra_predmeta() {
            return sifra_predmeta;
        }

        public void setNaziv_predmeta(String naziv_predmeta) {
            this.naziv_predmeta = naziv_predmeta;
        }

        public void setNiz_studenta(Student[] niz_studenata) {
            this.niz_studenata = niz_studenata;
        }

        public void setSifra_predmeta(int sifra_predmeta) {
            this.sifra_predmeta = sifra_predmeta;
        }

        public void upisi (Student s) {
            // ???
        }

        public void ispisi (Student s) {
            for (int i = 0; i < max_broj_studenata; i++) {
                System.out.println(i + "." + niz_studenata[i].ime + niz_studenata[i].prezime + niz_studenata[i].broj_indeksa);
            }
        }
    }
}
