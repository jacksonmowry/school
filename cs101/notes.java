class notes {
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