package newConcepts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExtraPractice {
	
		public static void main(String[] args) {
		String description = "[[ChromeDriver: chrome on windows (f599a07aac6e440f7db5176ec4a67101)] -> xpath: //input[@name='username']]";
       
           
           System.out.println(description.substring(description.indexOf("->") + 2).trim());
       
	}
}
