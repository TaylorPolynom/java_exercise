/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPArrays;

/**
 *
 * @author ALEKSANDAR
 */
public class Main {
    public static void main(String[] args) {
        int [] myIntArray ={0,1,2,3,4,5,6,7,8,9};  //new int[10];
//        myIntArray[0]=10;
//        myIntArray[1]=20;
//        myIntArray[5]=50;
      //  double [] myDoubleArray = new double[10];
//        System.out.println(myIntArray[5]);
//        System.out.println(myIntArray[0]);
//        System.out.println(myIntArray[8]);
            
        readArray(myIntArray);
    }
    
    public static void readArray( int[] a){
    for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
    }
    }
            
}
