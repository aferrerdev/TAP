package Pizzeria_Abstract_Factory;

/**
 * Created by alexferrerlopez on 1/11/15.
 */
public class PizzaFormatges extends Pizza {
    public PizzaFormatges() {
        super();
        this.setNom(this.nom + "Formatges");
        incrementarPreu(3);
        addTopping("formatge blau");
    }
}
