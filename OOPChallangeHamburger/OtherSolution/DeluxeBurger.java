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
public class DeluxeBurger extends Hamburger{
    
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon ", 14.56, "White");
        super.addHumbergerAddition1("Chips", 2.75);
        super.addHumbergerAddition2("Pepsi", 1.81);

    }

    @Override
    public void addHumbergerAddition4(String name, double price) {
    System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHumbergerAddition3(String name, double price) {
    System.out.println("Can not add additional items to a deluxe burger");    
    }

    @Override
    public void addHumbergerAddition2(String name, double price) {
    System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHumbergerAddition1(String name, double price) {
    System.out.println("Can not add additional items to a deluxe burger");    
    }
    
    
    
}
