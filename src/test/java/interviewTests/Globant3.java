package interviewTests;

public class Globant3 {

	//What will be the Output of this program
	
	int getValue() {
		int returnValue = 10;

		try {
			String[] Languages = {
					"Try block",
					"Try block is running", // corrected missing comma
					"3", // corrected missing quotes
					"4", // corrected missing quotes
					"5", // corrected missing quotes
					"6" // corrected missing quotes and added comma
			};
			System.out.println(Languages[1]);
		} catch (Exception e) {
			System.out.println("Catch Block" + returnValue);
			return returnValue;
		} finally {
			returnValue += 10;
			System.out.println("Finally Block" + returnValue);
		}
		return returnValue;
	}

	public static void main(String args[]) {
		Globant3 var = new Globant3(); // corrected missing variable name
		System.out.println("Main Block:" + var.getValue());
	}
}
