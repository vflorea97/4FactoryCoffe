package ro.mycode.Mobila;

public abstract class Cafea {

    private String nume;
    private double pret;

    public Cafea(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public String toString(){
        String text = "";
        text += "Nume: " + this.nume + "\n";
        text += "Pret: " + this.pret + "\n";
        return text;
    }
    public abstract void preparare();
    public abstract void comandaGata();
    public abstract void afisarePretDeAchitat();
    public void afisare(){
        System.out.println(this);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

}
