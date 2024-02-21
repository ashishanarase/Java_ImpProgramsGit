package interviewBased;

public class ReverseStringByWord {


	public static void main(String[] args) {
		String s = "My name is Ashish";
		String[] parts = s.split(" ");
		for(int i=parts.length-1;i>=0;i--) {
			System.out.print(parts[i]+ " ");
			
			
		}
	}
}

