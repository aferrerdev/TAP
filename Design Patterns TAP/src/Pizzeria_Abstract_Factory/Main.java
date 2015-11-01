package Pizzeria_Abstract_Factory;

/**
 * Created by alexferrerlopez on 1/11/15.
 */
public class Main {
    public static void main(String[] args) {
        //MondoPizza restaurant = MondoPizza.getInstance();
        TotPizza restaurant = new TotPizza();
        Pizza pizza = restaurant.comprarPizzaFormatges();
        Pizza pizza2 = restaurant.comprarPizzaTropical();
        System.out.println(pizza.toString());
        System.out.println(pizza2.toString());

        System.out.println("\n Ingredients Iterator:");
        for(String ingredient: pizza){
            System.out.println(ingredient);
        }
    }
}
