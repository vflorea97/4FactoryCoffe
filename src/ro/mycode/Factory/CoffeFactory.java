package ro.mycode.Factory;

import ro.mycode.Mobila.*;

public class CoffeFactory {

    public Cafea makeCoffe(String text){
        Cafea cafea = null;
        if (text.equals("Americano")){
            cafea = new Americano("Americano",10);
        }else if (text.equals("Cappuccino")){
            cafea = new Cappuccino("Cappuccino",12);
        }else if (text.equals("Espresso")){
            cafea = new Espresso("Espresso",8);
        }else if (text.equals("Latte")){
            cafea = new Latte("Latte",10);
        }
        return cafea;
    }
}
