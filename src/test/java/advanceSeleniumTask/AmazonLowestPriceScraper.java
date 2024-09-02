package advanceSeleniumTask;

import java.util.ArrayList;
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
		
		List<WebElement> priceElements = driver.findElements(By.xpath(""));
		
		// Store the prices in a list
        List<Integer> prices = new ArrayList<>();
        for (WebElement priceElement : priceElements) {
            String priceText = priceElement.getText().replace(",", "");
            try {
                int price = Integer.parseInt(priceText);
                prices.add(price);
            } catch (NumberFormatException e) {
                e.printStackTrace();  // Handle any parsing errors here
            }
        }
		
	}

}
