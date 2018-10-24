package ba.unsa.etf.rpr.predavanje03;

public class Predmet {
    private String naziv_predmeta;
    private int sifra_predmeta;
    private final int max_broj_studenata;   //????????
    private Student[] niz_studenata;

    Predmet (String naziv_predmeta, int sifra_predmeta, int max_broj_studenata) {
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

        /*for(int i = 0; i < getMax_broj_studenata(); i++)
            if(niz_studenata[i] == null) {
                niz_studenata[i] = s;
                break;
            }*/

    }

    public void ispisi (Student s) {
        /*int i=0;
        while(niz_studenata[i]!=null && !(s.equals(niz_studenata[i])))
            i++;
        while(niz_studenata[i]!=null) {
            if(niz_studenata[i+1]==null)
                niz_studenata[i]=null;
            else
                niz_studenata[i]=niz_studenata[i+1];
            i++;
        }*/

        for(int i = 0; i < getMax_broj_studenata(); i++)
            if(niz_studenata[i] != null && s.equals(niz_studenata[i]))  {
                for(int j = i; j < getMax_broj_studenata() - 1; j++)
                    if(niz_studenata[j] != null)
                        niz_studenata[j] = niz_studenata[j + 1];
                    i=max_broj_studenata;
            }
    }

    public void ispisi(){
        int i=0;
        while(niz_studenata[i]!=null){
            System.out.println(i+1 + "." + " " + niz_studenata[i]);
            i++;
        }
    }

    public Student dajStudenta(int i){
        if(niz_studenata[i]==null)
            return new Student("NU", "LL", 0);
        return niz_studenata[i];
    }
}
