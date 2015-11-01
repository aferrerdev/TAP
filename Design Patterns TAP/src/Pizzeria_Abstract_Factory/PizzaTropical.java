package Pizzeria_Abstract_Factory;

/**
 * Created by alexferrerlopez on 1/11/15.
 */
public class PizzaTropical extends Pizza {
    public PizzaTropical() {
        super();
        this.setNom(this.nom + "Tropical");
        incrementarPreu(2);
        addTopping("pinya");
    }
}
