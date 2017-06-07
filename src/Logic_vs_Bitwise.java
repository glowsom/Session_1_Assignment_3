import java.util.Scanner;

public class Logic_vs_Bitwise {

	public static void main(String[] args) {
		// TODO Compare Logic AND (&&), and Bitwise AND (&) 
		
		// Declaring and Initializing 2 Byte variables.
		byte a = 12;
		byte b = 26;

		Scanner user_input = new Scanner( System.in );
		
		//Showing one case of the comparison between "&" and "&&"
		
		// Requesting 2 values from user
		System.out.print("Enter first value (0 or 1): ");
		a = user_input.nextByte();
		System.out.print("Enter second value (0 or 1): ");
		b = user_input.nextByte();
		
		//Printing out Bitwise Result
		System.out.println("Bitwise And (&): " + (a&b));

		//Converting user input to Logic
		boolean boolA , boolB;
		if (a == 0) { boolA = false;}
		else {boolA = true;}
		if (b == 0) { boolB = false;}
		else {boolB = true;}
		
		//Printing out Logic Result
		System.out.println("Logic And (&&): " + (boolA && boolB) + "\n");
		
	}

}
