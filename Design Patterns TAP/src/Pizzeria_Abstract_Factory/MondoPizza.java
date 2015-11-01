package Pizzeria_Abstract_Factory;

/**
 * Created by alexferrerlopez on 1/11/15.
 */
public class MondoPizza extends PizzaFactory {

    private static MondoPizza MONDOPIZZA = new MondoPizza();

    public MondoPizza() {
        super("Mondo Pizza");
    }

    public static MondoPizza getInstance(){
        return MONDOPIZZA;
    }

    @Override
    public PizzaFormatges comprarPizzaFormatges() {
        return new PizzaFormatgesMondoPizza();
    }

    @Override
    public PizzaTropical comprarPizzaTropical() {
        return new PizzaTropicalMonoPizza();
    }
}
