public class Datatypes{

	public static void main(String a[]){

		System.out.println("Basic types in Java: ");

		int i = 100;
		long l = 100;
		short s = 50;
		byte b = 10;

		double d = 20.0;
		float f = 30.0f;

		char c = 'c';
		
		boolean b2 = true; //value of boolean type can be either true or false

		// print statements 

		System.out.println("Prints line and moves cursor to next line.");
		System.out.print("Prints line and cursor stays on the same line.");
		System.out.printf("\n Information %d", 20);

		//printing values in variables declared above

		System.out.printf("\nValue in int: %d", i);
		System.out.printf("\nValue in long: %d", l);
		System.out.printf("\nValue in short: %d", s);
		System.out.printf("\nValue in byte: %d", b);

		System.out.printf("\nValue in double: %.2f", d);
		System.out.printf("\nValue in float: %.2f", f);

		System.out.printf("\nValue in char: %c", c);
		
		System.out.printf("\nValue in boolean: %b", b2);

		//System.out.err("Error log. i.e. used to print error messages");

		System.out.printf("\n %-50s : %s", "Shahid", "Muhammad");

	}

}