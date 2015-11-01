package Pizzeria_Abstract_Factory;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by alexferrerlopez on 1/11/15.
 */
public abstract class Pizza implements Iterable<String> {
    String nom;
    double preu;
    List<String> toppings;

    public Pizza() {
        this.nom = "Pizza";
        this.preu = 5;
        toppings = new LinkedList<String>();
        toppings.add("Tomaquet");
        toppings.add("Mozzarella");
    }

    public void addTopping(String topping){
        toppings.add(topping);
    }

    public void removeTopping(String topping){
        toppings.remove(topping);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public void incrementarPreu(double increment){
        this.preu = this.preu + increment;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setTopping(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return  nom+" Preu: "+preu + " Ingredients: "+toppings.toString();
    }

    @Override
    public Iterator<String> iterator() {
        return toppings.iterator();
    }
}
