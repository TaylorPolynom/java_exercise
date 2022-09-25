/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChalangePrinter;

/**
 *
 * @author Vekic
 */
public class Main {
    public static void main (String [] arg){
    Printer sony = new Printer("Sony",100, 100, false);
    sony.printPage(50);
        System.out.println("toner level after printing pages: "+sony.getTonerLevel()+" %.");
        sony.fill();
        System.out.println("toner level after filling toner: "+sony.getTonerLevel()+" %.");
        System.out.println("***********************************");
    Printer o = new Printer("OH",0,100,true);
    o.printPage(100);
    
    }
}
