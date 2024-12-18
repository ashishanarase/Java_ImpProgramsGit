package interviewBased;

public class CharArray {
	
	public static void main(String[] args) {
		
		char [] charArray = {'a','s','h','i','s','h'};
		
		 // Convert char array to String
        String str = new String(charArray);

        // Print the result
        System.out.println("Char Array to String: " + str);
        
        String str2 = "anarase";
        
        char [] charArray2 = str2.toCharArray();
        
        System.out.println(charArray2[1]);
	}
	
	

}
