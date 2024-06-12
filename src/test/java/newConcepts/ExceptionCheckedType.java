package newConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionCheckedType {


	public static void main(String[] args)  {

		String path = "C:\\Users\\ashish.anarase\\Desktop\\OD Sample2.png";
		try {
			FileInputStream infile = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Checked Exception = java.io.FileNotFoundException

	}
}
