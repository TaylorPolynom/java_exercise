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
public class Printer {
    private String name;
    private int tonerLevel;
    private int totalPages;
    private boolean isDuplex;
    

    public Printer(String name, int tonerLevel, int totalPages, boolean isDuplex) {
        
        this.name = name;
        if(getTonerLevel()>0){
        this.tonerLevel = tonerLevel;
        }else{
        this.tonerLevel=0;
            System.out.println("You should refill it!!!!!!");
            
        }
        this.totalPages=totalPages;
        this.isDuplex = isDuplex;
        System.out.println("Number of max pages that can be printed at "+getTonerLevel() +" % toner level and if isDuplex: "+this.isDuplex+" , max number of paper in loader >  : "+getTotalPages()+" pages.");
        System.out.println(this.getName()+" has a total level of toner: "+this.getTonerLevel()+" %.");
       


    }

    public String getName() {
        return name;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    

    public boolean isIsDuplex() {
        return isDuplex;
    }

    public int getTotalPages() {
        return totalPages;
    }
    
    public void fill(){
    if(getTonerLevel()<100){
    this.tonerLevel=100;
        System.out.println("Toner is fill to: "+getTonerLevel());
    }else if(getTonerLevel()>=100){
    this.tonerLevel=100;
    }
    
    }
    
   public  void printPage(int pages){
     if(getTonerLevel()<=0){
         System.out.println("Sorry cant print no ink in torenr fill it up");
     }  else{
     int printPages=0;
     int remainPagesToPrint=0;
     int remainPaper=0;//paper that is left for continuous printing in printer
     if(this.isDuplex!=true){
     if(pages<0){
       System.out.println("Error....Cant print 0 pages");
   }else if(pages>this.totalPages){
   System.out.println("Toner level before printing: "+getTonerLevel());    
   printPages=this.totalPages;
   this.tonerLevel=0;
   remainPagesToPrint=pages-printPages;
   }else{
       System.out.println("Toner level before printing: "+getTonerLevel());
   printPages=pages;
   this.tonerLevel=(((getTonerLevel()-printPages)*100)/100);
   remainPaper=this.totalPages-printPages;
   totalPages=remainPaper;
   
   }
     }else{
     //duplex is true!!!!!!
     if(pages<0){
       System.out.println("Error....Cant print 0 pages");
   }else if(pages>this.totalPages){
   System.out.println("Toner level before printing: "+getTonerLevel());    
   printPages=this.totalPages/2;
   this.tonerLevel=0;
   remainPagesToPrint=pages-printPages;
   }else{
       System.out.println("Toner level before printing: "+getTonerLevel());
   printPages=pages/2;
   this.tonerLevel=(((getTonerLevel()-printPages)*100)/200);
   remainPaper=this.totalPages-printPages;
   totalPages=remainPaper;
   
   }
     
     
     
     }
      System.out.println("This is duplex printing : "+this.isIsDuplex());
       System.out.println("Printed pages: "+printPages);
       System.out.println("Remain pages to print: "+remainPagesToPrint);
       System.out.println("Remain paper in printer: "+remainPaper);
       System.out.println("Toner level  after printing: "+printPages+" pages is : "+this.getTonerLevel()+" %.");

      }
   }
}