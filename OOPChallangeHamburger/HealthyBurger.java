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
public class HealthyBurger extends Burger {
   private String addition1;
   private String addition2;
    public HealthyBurger() {
        super("Brown rye bread roll","healthy meat");
        
      
       
    }

    public String getAddition1() {
        return addition1;
    }

    public String getAddition2() {
        return addition2;
    }

    @Override
    public void addAdditions(int num) {
        //6 additions in total
        if(num>0 && num<=4){
        super.addAdditions(num);
        }
        else if(num==5){
          this.addition1 = "healthy rice";
          super.setAdditive(","+this.addition1);
          super.setPrice(super.getPrice()+1.5);
          super.setSumadd(super.getAdditive());
        
        }else if(num==6){
         this.addition2 = "healthy cheese";
         super.setAdditive(","+this.addition2);
         super.setPrice(super.getPrice()+1);
         super.setSumadd(super.getSumadd()+super.getAdditive());

          

        
        }
        }
        
    

    @Override
    public String toString() {
      return "Healthy Burger{" + "breadType=" + super.getBreadType() + ", meat=" + super.getMeat() + ", price=" + super.getPrice() + ", additive=" + super.getSumadd() + '}';
    }
    
    
    
}
