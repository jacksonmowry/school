//
// Jackson Mowry
// Feb 8 2022
// This is a program that will ask the user for 3 number (read as doubles)
// Then it will divide the first two and finally add the third
// The program will the print out the operations performed along with the values used
// and will display the result as a formatted string with values inline
//

import java.util.Scanner;
class varops {
	public static void main(String[] args) {
		// First we set up the variables and their data types.
		double a;
		double b;
		double c;
		// Next we initialize the scanner (named s) to accept user input.
		// The console with then output our user prompt
		// We then read each number (delimited by the space character),
		// and assign it to the proper variable
		Scanner s = new Scanner(System.in);
		System.out.print("Enter three doubles (a / b + c): ");
		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();
		s.close();
		// Next we create our output value
		// Finally we format a string to output both the user data
		// and the result of performing the operations
		double result = (a / b + c);
		System.out.format("%.2f %s %.2f %s %.2f %s %.2f %n", a, "/", b, "+", c, "=", result);
	}
}
