package taskBasedProgram;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculation {
	
	//Find the age of any person using Java program
	
	static String desiredDate = "1993-04-16";
	
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
		LocalDate birthDate = LocalDate.parse(desiredDate);
		
		Period age = Period.between(birthDate, today);
		
		System.out.println(age.getYears()+" Years "+age.getMonths()+" Months "+age.getDays()+" Days");
	}

}
