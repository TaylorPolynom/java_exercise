/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.challangeGitBurger;

/**
 *
 * @author ALEKSANDAR
 */
public class Main {
    public static void main(String[] args) {
//        Burger obj1 = new Burger("white", "chiken");
//        System.out.println(obj1);
//        obj1.addAdditions(1);
//        obj1.addAdditions(2);
//        System.out.println(obj1);
//
//        obj1.addAdditions(5);
//
//         System.out.println(obj1);
//         
//        System.out.println("****************************************");
//      obj1=new HealthyBurger();
//        System.out.println(obj1);
//      
//      obj1.addAdditions(5);
//       System.out.println(obj1);
//      obj1.addAdditions(1);
//      System.out.println(obj1);
//      obj1.addAdditions(6);
//        System.out.println(obj1);
        double sum=0;
        DeluxeBurger obj1= new DeluxeBurger();
        HealthyBurger obj2 = new HealthyBurger();
        obj1.addAdditions(1);
        obj2.addAdditions(4);
        
       
        System.out.println(obj1);
        System.out.println(obj2);
       sum+=obj1.getPrice();
        System.out.println("Sum of total meak bought: "+sum);
        sum+=obj2.getPrice();
        System.out.println("Sum of total meak bought: "+sum);
}
}