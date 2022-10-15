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
public class Burger {

    private String breadType;
    private String meat;
    private double price;
    private double aditivePrice;
    private String additive;
    private String sumadd;
    private int count;

    public Burger(String breadType, String meat) {
        System.out.println("This is basic hamburger!");
        System.out.println("Additional condoments are :1-ketchup,2-mustard,3-garlic,4-letuce");
        this.breadType = breadType;
        this.meat = meat;
        this.price = 5;//5$ price of regular burger!!!!!
        this.count = 0;
        this.aditivePrice = 2;//each addition costs extra 2$

    }

    public void addAdditions(int num) {
        count++;
       
        switch (num) {
            case 1:
                this.additive = "ketchup";
                this.sumadd += "{" + this.additive + "}";
                this.price += this.aditivePrice;

                break;
            case 2:
                this.additive = "mustard";
                this.sumadd += "{" + this.additive + "}";

                break;
            case 3:
                this.additive = "garlic";
                this.sumadd += "{" + this.additive + "}";
                this.price += this.aditivePrice;

                break;
            case 4:
                this.additive = "letuce";
                this.sumadd += "{" + this.additive + "}";
                this.price += this.aditivePrice;

                break;
            default:
                System.out.println("Condoment is not added");
                count = 0;
                this.aditivePrice = 0;
                break;

        }

    }

    @Override
    public String toString() {
        return "Burger{" + "breadType=" + breadType + ", meat=" + meat + ", price=" + price + ", additive=" + sumadd + '}';
    }

}
