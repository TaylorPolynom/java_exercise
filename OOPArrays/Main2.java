/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPArrays;

import java.util.Scanner;

/**
 *
 * @author ALEKSANDAR
 */
public class Main2 {
    static Scanner in  = new Scanner(System.in);
    public static void main(String[] args) {
     int []niz=new int[5];
        getArray(niz);
        for (int i = 0; i < niz.length; i++) {
            System.out.println(i+":"+niz[i]);
            
        }
     
        
        
    }
    public static int [] getArray(int []a){
        for (int i = 0; i < a.length; i++) {
            a[i]=in.nextInt();
            
        }
    return a;
    }
}
