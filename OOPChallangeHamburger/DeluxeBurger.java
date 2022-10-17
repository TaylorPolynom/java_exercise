/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.challangeGitBurger;

/**
 *
 * @author Vekic
 */
public class DeluxeBurger extends Burger{
    private String chips;
    private String drinks;
    private double price;
    public DeluxeBurger() {
        super("White bread","cow meet");
     
     
        this.price=20;
    }

    
    public void addAdditions(int num) {
        if(num==1){
         this.chips="Chips";
         price=this.getPrice()+2;
        }
        else if(num==2){
        this.drinks="Coca Cola";
        price=this.getPrice()+1;
        }
    }

    public String getChips() {
        return chips;
    }

    public String getDrinks() {
        return drinks;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "DeluxeBurger{" +super.getMeat() +","+ "chips=" + chips + ", drinks=" + drinks + ", price=" + price + '}';
    }

    
    
    
}
