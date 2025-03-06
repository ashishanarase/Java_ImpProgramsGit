package dataManipulationFromFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchDataFromExcelFileUsingParameterization {
	
	public static void main(String[] args) throws Throwable {
		
		String sample_sheet = "C:\\Users\\ASHISH\\eclipse-workspace\\Java_ImpProgramsGit\\src\\DataForAccess\\Book1.xlsx";
		//Create a object of file class
		File exfile = new File(sample_sheet);
		
		//Create object file input stream
		FileInputStream infile = new FileInputStream(exfile);
	
		try (//Create object of XSSFWorkBook
		XSSFWorkbook new_book = new XSSFWorkbook(infile)) {
			//Create object for sheet
			XSSFSheet exsheet = new_book.getSheetAt(0);	//Sheet index starts from 0
			
			//Row1
			XSSFRow exrow = exsheet.getRow(1);			//Row index starts from 0
			
			//Column
			String data0 = exrow.getCell(1).getStringCellValue();
			System.out.println(data0);
			

			//To set the data in excel file
			exsheet.getRow(1).createCell(1).setCellValue("New Cell");
			FileOutputStream fos = new FileOutputStream(exfile);
			new_book.write(fos);
			new_book.close();
		}	
		
	}

}
