package ro.mycode.Cafenea;

import ro.mycode.Factory.CoffeFactory;
import ro.mycode.Mobila.Cafea;

public class Cafenea {

    private CoffeFactory coffeFactory;

    public Cafenea(CoffeFactory coffeFactory) {
        this.coffeFactory = coffeFactory;
    }

    public Cafea comanda(String text){
        Cafea cafea = coffeFactory.makeCoffe(text);
        cafea.preparare();
        cafea.comandaGata();
        cafea.afisarePretDeAchitat();
        return cafea;
    }
}
