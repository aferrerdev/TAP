package Pizzeria_Abstract_Factory;

/**
 * Created by alexferrerlopez on 1/11/15.
 */
public class PizzaTropicalMonoPizza extends PizzaTropical {
    public PizzaTropicalMonoPizza() {
        super();
        addTopping("Xampinyons");
        incrementarPreu(3);
    }
}
