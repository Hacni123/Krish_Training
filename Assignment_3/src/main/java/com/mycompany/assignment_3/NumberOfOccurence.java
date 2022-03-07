/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_3;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class NumberOfOccurence {
    // Main driver method
    public static void main(String[] args) throws Exception
    {
        // Custom string input
       // String str = "zgpwhka";
      
        // Converting string into an array for computation
       
     
        int k, length, counter[] = new int[256];
 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.nextLine();
        String str2= str.toLowerCase();
        length = str2.length();
 
        // Count frequency of every character and store
        // it in counter array
        for (k = 0; k < length; k++) {
            counter[(int) str2.charAt(k)]++;
        }
        // Print Frequency of characters
        for (k = 0; k < 256; k++) {
            if (counter[k] != 0) {
                System.out.println((char) k + " --> " + counter[k]);
            }
            
            //printLetterOccurrence(str2);
        }
    }
}
    