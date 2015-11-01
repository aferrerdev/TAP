package Pizzeria_Abstract_Factory;

/**
 * Created by alexferrerlopez on 1/11/15.
 * Restaurant Genèric
 */
public abstract class PizzaFactory {
    private String nom;

    public PizzaFactory(String nom) {
        this.nom = nom;
    }

    public abstract PizzaFormatges comprarPizzaFormatges();
    public abstract PizzaTropical comprarPizzaTropical();

    public String getNom() {
        return nom;
    }
}
