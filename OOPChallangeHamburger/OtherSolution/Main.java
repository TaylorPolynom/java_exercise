/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPChallangeHamburger.OtherSolution;

/**
 *
 * @author ALEKSANDAR
 */
public class Main {
    public static void main(String[] args) {
        Hamburger hamburger  = new Hamburger("Basic", "sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHumbergerAddition1("Tomato", 0.27);
        hamburger.addHumbergerAddition2("Lettuce", 0.75);
        hamburger.addHumbergerAddition3("Cheese", 1.12);
        System.out.println("Total price of hamburger is "+hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHumbergerAddition1("Egg", 5.48);
        healthyBurger.addHealthAddition1("Letuce", 3.41);
        System.out.println("Total price of healthy burger is "+ healthyBurger.itemizeHamburger());
        
        DeluxeBurger db = new DeluxeBurger();
        db.addHumbergerAddition1("Could not add this", 50.33);
        db.itemizeHamburger();


        
    }
}
