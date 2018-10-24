package ba.unsa.etf.rpr.predavanje03;

public class Program {

     public class Student {
        private String ime;
        private String prezime;
        private int broj_indeksa;

        Student(String ime, String prezime, int index) {
            this.ime = ime;
            this.prezime=prezime;
            this.broj_indeksa=index;
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

        //@override
        public String toString() {
            String s = ime + " " + prezime + " " + "(" + broj_indeksa + ")";
            return s;
        }

        public void ispisi(){
            System.out.println(this);
        }
    }

    public class Predmet {
        private String naziv_predmeta;
        private int sifra_predmeta;
        private int max_broj_studenata=0;   //????????
        private Student[] niz_studenata;

        Predmet(String naziv_predmeta, int sifra_predmeta, int max_broj_studenata) {
            this.naziv_predmeta = naziv_predmeta;
            this.niz_studenata = new Student[max_broj_studenata];
            this.max_broj_studenata = max_broj_studenata;
            this.sifra_predmeta=sifra_predmeta;
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
           int i=0;
           while(niz_studenata[i]!=null)
               i++;
           niz_studenata[i]=s;
        }

        public void ispisi (Student s) {
            int i=0;
            while(!(s.equals(niz_studenata[i])))
                i++;
            int j=i;
            while(niz_studenata[j]!=null) {
                niz_studenata[j]=niz_studenata[j+1];
                j++;
            }
        }

        public void ispisi(){
            int i=0;
            while(niz_studenata[i]!=null)
                System.out.println(i+1 + "." + " " + niz_studenata[i]);
        }
    }
}
