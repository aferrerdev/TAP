package Pizzeria_Abstract_Factory;

/**
 * Created by alexferrerlopez on 1/11/15.
 */
public class PizzaTropicalTotPizza extends PizzaTropical {
    public PizzaTropicalTotPizza() {
        super();
        addTopping("Olives Negres");
        incrementarPreu(2);
    }
}
