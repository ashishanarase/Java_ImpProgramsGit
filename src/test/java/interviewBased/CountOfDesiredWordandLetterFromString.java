package interviewBased;

public class CountOfDesiredWordandLetterFromString {

	public static void main(String[] args) {
		
		//Get the count of desired word (asked for SLB)
		
		String inputString = "big black bug bit a big black dog on his big black nose";
		
		String desiredWord = "black";
		
		String parts [] = inputString.split(" ");
		
		int count = 0;
		
		for (String part : parts) {
			if (part.equals(desiredWord)) {
				count++;
			}			
		}
		System.out.println(count);
	}

}
