package dataManipulationFromFile;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class CSVReaderClass {

	
	/*There is data related to user information or account details on webpage. Validate that with the
	Data stored in CSV file on your local machine */
	
	public static void main(String[] args) throws IOException, CsvException {

		String path = "C:\\Users\\ashish.anarase\\Desktop\\Test_A_SampleFile.csv";
		CSVReader reader = new CSVReader(new FileReader(path));
		List<String[]> data = reader.readAll();

		// Print the data from the CSV file
		int rowIndex = 0; // 0-based index of the row
		int columnIndex = 0; // 0-based index of the column

		// Retrieve the data from the specified cell
		String[] row = data.get(rowIndex);
		String cellData = row[columnIndex];

		// Display the cell data
		System.out.println("Data at row " + rowIndex + ", column " + columnIndex + ": " + cellData);
	}
}
