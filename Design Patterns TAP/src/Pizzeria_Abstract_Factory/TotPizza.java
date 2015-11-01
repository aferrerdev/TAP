package Pizzeria_Abstract_Factory;

/**
 * Created by alexferrerlopez on 1/11/15.
 */
public class TotPizza extends PizzaFactory {

    public TotPizza() {
        super("Tot Pizza");
    }

    @Override
    public PizzaFormatges comprarPizzaFormatges() {
        return new PizzaFormatgesTotPizza();
    }

    @Override
    public PizzaTropical comprarPizzaTropical() {
        return new PizzaTropicalTotPizza();
    }
}
