package cosc1336;

/**
Andrew Hoffman
COSC 1336
Instructor: Dr. Doerschuk
Programming Assignment 1
Due: 20210210
This program will compute the area and perimeter of a 
rectangle with width of 8.2 and height of 10.3 using given formulas
**/

public class RectangleAndrewHoffman {
	
	public static void main(String[] args) {
	
		double height = 10.3; // Assign variable height

		double width = 8.2; // Assign variable width

		double area = height * width; // Equation to calculate area

		double perimeter = 2 * (height + width); // Equation to calculate perimeter

		System.out.println(area); // Print area
		
		System.out.println(perimeter); // Print perimeter

	}


}
