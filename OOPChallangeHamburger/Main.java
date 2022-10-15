/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPChallangeHamburger;

/**
 *
 * @author ALEKSANDAR
 */
public class Main {
    public static void main(String[] args) {
        Burger obj1 = new Burger("white", "chiken");
        System.out.println(obj1);
        obj1.addAdditions(1);
        obj1.addAdditions(2);
        System.out.println(obj1);

        obj1.addAdditions(5);

         System.out.println(obj1);
    }
}