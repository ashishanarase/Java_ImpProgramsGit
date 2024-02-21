package dataManipulationFromFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FetchDataFromTXTFile {
	
	public static void main(String[] args) {
		
		 String filePath = "C:\\Users\\ASHISH\\eclipse-workspace\\Java_ImpProgramsGit\\src\\DataForAccess\\TextFile.txt"; // Specify the path to your text file
	        
	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                // Process each line of the text file here
	                System.out.println(line); // For example, print each line to the console
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
	}
	
	

}
