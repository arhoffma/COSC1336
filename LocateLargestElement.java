package cosc1336;

/******************************************

COSC 1336
Programming Assignment 8

Write a test program that prompts the user 
to enter a two-dimensional array and displays 
the location of the largest element in the array.

******************************************/

import java.util.Scanner;

public class LocateLargestElement {
	
	/* Main Method*/
	public static void main(String[] args) {
		
		// Create new Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt User for Input - Number Rows and Columns in Array
        	System.out.print("Enter the number of rows and columns in the array: ");
        
		int rows = input.nextInt();
        	int columns = input.nextInt();
        	double[][] userArray = new double[rows][columns]; 
        
        	// Prompt User for Input - Enter Array
	        System.out.println("Enter the array:");
        
        	for (int i = 0; i < userArray.length; i++) {
        	    for (int j = 0; j < userArray[i].length; j++) {
                	userArray[i][j] = input.nextDouble();
		    }
		}

        	int[] location = locateLargest(userArray);
        
        	// Print Result
	        System.out.printf("The location of the largest element is at (%d, %d).%n",
        	    location[0], location[1]);
    
        	input.close();
	}
	
	/* Method locateLargest */
	public static int[] locateLargest(double[][] a) {
        	int[] location = new int[]{0, 0};
        	double largest = a[0][0];
        	for (int i = 0; i < a.length; i++) {
        	    for (int j = 0; j < a[i].length; j++) {
        	        if (largest < a[i][j]) {
        	            largest = a[i][j];
                	    location[0] = i;
                	    location[1] = j;
			}
		    }  
		}
       		return location;
	}	
}
