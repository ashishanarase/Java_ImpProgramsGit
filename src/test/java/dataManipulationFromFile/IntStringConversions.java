package dataManipulationFromFile;

public class IntStringConversions {
	
	public static void main(String[] args) {
		
		int value1 = 123;
		String var1 = Integer.toString(value1);
		System.out.println(var1);
		
		String var2 = "456";
		int value2 = Integer.parseInt(var2);
		System.out.println(value2);
	}

}
