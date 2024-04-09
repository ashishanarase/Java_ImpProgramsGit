package interviewBased;

public class SwapString {

	public static void main(String[] args) {

		String new1 = "Ashish Anarase";
		String new2 = "Ashish Jayram Anarase";

		String temp = new2;
		new2 = new1;
		new1 = temp;

		System.out.println(new1);
		System.out.println(new2);

	}
}

