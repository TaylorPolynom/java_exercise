/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPArrays;

import java.util.Scanner;

/**
 * Challange_Sorting_an_Array_Of_N_Elements_In_Descending_Order create 3 methods
 getInteger(),printIntegers(),sortIntegers()
 Sorting an array in descending order for #ex 1,2,3,4,5 after 
 sorting # 5,4,3,2,1;
 * @author ALEKSANDAR
 */
public class Challange_Sorting_an_Array_Of_N_Elements_In_Descending_Order {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number of elements");
        int n = in.nextInt();
        int [] arr=getIntegers(n);
        printArray(arr);
        int [] b= sort(arr);
        System.out.println("****************");
        printArray(b);
     
        
       
        
    }

    private static int[] getIntegers(int n) {
        int []a=new int[n];
        System.out.println("Your array have "+a.length +" elements");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter "+i+" element of array" );
            a[i]=in.nextInt();
        
        }
        return  a;
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element of array ["+i+"] is: "+arr[i]);
        }
    }
    
    public static int [] sort(int [] a){
        for (int i = 0; i < a.length-1; i++) {
           for(int j=0;j<a.length-1;j++){
               if(a[j+1]>a[j]){
               int temp = a[j+1];
               a[j+1]=a[j];
               a[j]=temp;
               
               }
               
           }
        
        }
    
    
    return a;
    }
    
}
