/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPChallangeHamburger;

/**
 *
 * @author Vekic
 */
public class DeluxeBurger extends Burger{
    private String addition1;
    private String addition2;
    private double price;
    public DeluxeBurger() {
        super("White bread","cow meet");
     
     
        this.price=20;
    }

    
    public void addAdditions(int num) {
        if(num==1){
         this.addition1="Chips";
         price=this.getPrice()+2;
        }
        else if(num==2){
        this.addition2="Coca Cola";
        price=this.getPrice()+1;
        }
    }

    public String getAddition1() {
        return addition1;
    }

    public String getAddition2() {
        return addition2;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "DeluxeBurger{"+"BreadType="+super.getBreadType()+" ,meat=" +super.getMeat() +","+ "addition1=" + getAddition1() + ", addition2=" + getAddition2() + ", price=" + price + '}';
    }

    
    
    
}
