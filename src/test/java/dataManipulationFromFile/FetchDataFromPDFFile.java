package dataManipulationFromFile;

import java.io.File;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class FetchDataFromPDFFile {

	
	public static void main(String[] args) {
		
		 try {
	            // Load PDF document
			 PDDocument document = PDDocument.load(new File("C:\\Users\\ASHISH\\eclipse-workspace\\Java_ImpProgramsGit\\src\\DataForAccess\\Ashish_CV.pdf"));
	            
	            // Create PDFTextStripper
	            PDFTextStripper pdfStripper = new PDFTextStripper();
	            
	            // Get text from PDF
	            String pdfText = pdfStripper.getText(document);
	            System.out.println(pdfText); // Print extracted text
	            
	            // Close the document
	            document.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
}
