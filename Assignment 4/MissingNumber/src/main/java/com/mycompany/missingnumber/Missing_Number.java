/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.missingnumber;

/**
 *
 * @author Dell
 */
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Missing_Number {
    
// Function to print pairwise absolute
// difference of consecutive elements
static void pairwiseDifference(int[] arr, int n)
{
    System.out.println("Enter to method : ");
    int diff;
    //for (int i = 0; i < n - 1; i++) {
        // absolute difference between
        // consecutive numbers
    //    diff = Math.abs(arr[i] - arr[i + 1]);
     //   System.out.print(diff+" ");
  //  }
    int count=0;
    int count2=0;
    int missvalue=0;
   int Previous = arr[0]; // Keeps previous value of array and is used to print.
    System.out.println("List   Difference");
    for (int I=0; I<arr.length; I++) {
    int J=I+1;
    Previous = Previous - arr[I];
    System.out.println(" "+J+"   "+Previous);
    
    if(Previous==-2 )
    {
        missvalue=arr[I]-1;
        
        count=count+1;
        System.out.println("count "+count);
    }
    else if(Previous<-2 )
    {
        count2=count2+1;
    }
 
    Previous = arr[I];
}
    if(count==1)
    {
        System.out.println("Missing Number is  "+missvalue);
    }
    else if(count>1)
    {
        System.out.println("More than one number is missing");
    }
    else if(count2>0)
    {
       System.out.println("Difference of two consecutive numbers is not 1");
    }
    else if(count==0)
    {
        System.out.println("System may has no missing number");
        System.out.println("System may miss first element or last element");
    }
}

static int[] sort(int[] arr, int n)
{
    int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
              if(arr[i]>arr[j])
              {
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                  
              }
            }
        }
        return arr;
}
 
// Driver Code
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
   
     System.out.println("Enter Your Numbers : ");
     String str = sc.nextLine();
        String[] split = str.split(" ");
    int[] arr = new int[split.length];
    for (int i = 0; i < split.length; i++)
        arr[i] = Integer.parseInt(split[i]);
       
    int n = arr.length;
     
    pairwiseDifference(sort(arr,n), n);
    
    

}
}