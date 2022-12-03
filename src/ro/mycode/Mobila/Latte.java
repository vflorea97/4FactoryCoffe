package ro.mycode.Mobila;

public class Latte extends Cafea{
    public Latte(String nume, double pret) {
        super(nume, pret);
    }
    @Override
    public void preparare() {
        System.out.println("Se pregateste un " + this.getNume() + "...");
    }

    @Override
    public void comandaGata() {
        System.out.println("Comanda este peregatita!");

    }

    @Override
    public void afisarePretDeAchitat() {
        System.out.println("Aveti de achitat " + this.getPret());
    }
}
