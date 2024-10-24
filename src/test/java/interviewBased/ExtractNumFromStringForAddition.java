package interviewBased;

public class ExtractNumFromStringForAddition {

	public static void main(String[] args) {
		String strAmount1 = "$300";
		String strAmount2 = "$220";

		// Extract numeric parts and convert to integers
		int amount1 = Integer.parseInt(strAmount1.substring(1));  // Removing the '$' and converting to int
		int amount2 = Integer.parseInt(strAmount2.substring(1));  // Removing the '$' and converting to int

		// Perform addition
		int result = amount1 + amount2;

		// Display the result
		System.out.println("Result of addition: $" + result);		

	}
}
