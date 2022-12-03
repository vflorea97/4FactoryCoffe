package ro.mycode.Cafenea;

import org.junit.jupiter.api.Test;
import ro.mycode.Factory.CoffeFactory;
import ro.mycode.Mobila.Cafea;

import static org.junit.jupiter.api.Assertions.*;

class CafeneaTest {

    @Test
    void comanda() {
        CoffeFactory coffeFactory = new CoffeFactory();
        Cafenea cafenea = new Cafenea(coffeFactory);

        Cafea cafea = cafenea.comanda("Americano");
    }
}