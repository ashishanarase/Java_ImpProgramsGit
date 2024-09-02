package advanceSeleniumTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLowestPriceScraper  {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		WebElement txtBox_search_homePage = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		
		WebElement btn_search_homePage = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		
		txtBox_search_homePage.sendKeys("My Phone");
		
		btn_search_homePage.click();	
		
		 // Locate price elements
        List<WebElement> priceElements = driver.findElements(By.cssSelector("span.a-price-whole"));
        
		// Store the prices in a list
        List<Integer> prices = new ArrayList<>();
        for (WebElement priceElement : priceElements) {
        	String priceText = priceElement.getText().replaceAll(",", "");
            try {
                int price = Integer.parseInt(priceText);
                prices.add(price);
            } catch (NumberFormatException e) {
                e.printStackTrace();  // Handle any parsing errors here
            }
        }	
        
        Collections.sort(prices);
        
        System.out.println("Lowest price from the list of Phones = ₹."+prices.get(0)+".00/-");
	}

}
