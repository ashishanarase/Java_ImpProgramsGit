package dataManipulationFromFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProductionDimensionComparison {

	public static void main(String[] args) {
		String string1 = "Width:  4.8\" \nHeight: 19.5\"\nDepth : 4.8\"";
		String string2 = "Width: 4.75\" \nDepth: 4.75\"\nHeight: 19.5\"";

		//	String string1 = "11\" w x 19\" d x 34\" h";
		//	String string2 = "w:11\" d:19\" h:34\"";

		// Pattern to extract the numeric values for Width, Height, and Depth
		Pattern widthPattern = Pattern.compile("Width:\\s*([\\d.]+)");
		Pattern heightPattern = Pattern.compile("Height:\\s*([\\d.]+)");
		Pattern depthPattern = Pattern.compile("Depth\\s*:\\s*([\\d.]+)");

		// Extract Width, Height, Depth for String 1
		double width1 = extractDimension(string1, widthPattern);
		double height1 = extractDimension(string1, heightPattern);
		double depth1 = extractDimension(string1, depthPattern);

		System.out.println(width1);
		System.out.println(height1);
		System.out.println(depth1);		

		// Extract Width, Height, Depth for String 2
		double width2 = extractDimension(string2, widthPattern);
		double height2 = extractDimension(string2, heightPattern);
		double depth2 = extractDimension(string2, depthPattern);

		System.out.println(width2);
		System.out.println(height2);
		System.out.println(depth2);

		// Allow small margin of error (tolerance)
		double tolerance = 0.05;

		// Compare the dimensions with tolerance for floating-point precision
		if (Math.abs(width1 - width2) <= tolerance &&
				Math.abs(height1 - height2) <= tolerance &&
				Math.abs(depth1 - depth2) <= tolerance) {
			System.out.println("The dimensions are equal.");
		} else {
			System.out.println("The dimensions are not equal.");
		}
	}

	// Helper function to extract the numeric value from the string using the given pattern
	private static double extractDimension(String inputString, Pattern pattern) {
		Matcher matcher = pattern.matcher(inputString);
		if (matcher.find()) {
			return Double.parseDouble(matcher.group(1));
		}
		return 0.0; // Return 0.0 if no match is found
	}
}

