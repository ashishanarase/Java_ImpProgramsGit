package interviewBased;

public class RemoveSpaceFromString {

	public static void main(String[] args) {
		String st="The Sun Is Brightest Star";
		String ns = st.replaceAll("\\s","");
		System.out.println(ns);
	}
}
 
