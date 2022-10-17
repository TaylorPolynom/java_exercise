/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPChallangeHamburger;

import java.util.Scanner;

/**
 *
 * @author ALEKSANDAR
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to burger shop");
        System.out.println("Info:\n1-Regular Burger\n2-Healthy Burger\n3-Deluxe Burger");
        System.out.println("Enter a number to choose a meal");
        Burger obj1;
        int num = in.nextInt();
        in.nextLine();
        switch (num) {
            case 1:
                obj1 = new Burger("Default bread", "default meat");
                System.out.println("Enter how many addition you want to add");
                int n = in.nextInt();
                for (int i = 0; i < n; i++) {
                    System.out.println("Enter a number for addition 1-4");
                    int num1 = in.nextInt();
                    obj1.addAdditions(num1);
                }
                System.out.println(obj1);
                break;
            case 2:
                obj1 = new HealthyBurger();
                System.out.println("Enter how many addition you want to add");
                n = in.nextInt();
                for (int i = 0; i < n; i++) {
                    System.out.println("Enter a number for addition 1-6,4-6");
                    int num1 = in.nextInt();
                    obj1.addAdditions(num1);
                    
                }
                System.out.println(obj1);
                break;
            case 3:
                obj1 = new DeluxeBurger();
                System.out.println("Enter how many addition you want to add");
                n = in.nextInt();
                for (int i = 0; i < n; i++) {
                    System.out.println("Enter a number for addition 1-2 for Deluxe.Where 1:cheeps,2:Juice");
                    int num1 = in.nextInt();
                    obj1.addAdditions(num1);
                }
                System.out.println(obj1);
                break;
            default:
                System.out.println("Something is wrong!");
                break;
        }

    }
}
