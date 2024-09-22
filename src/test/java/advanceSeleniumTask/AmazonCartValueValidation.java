package advanceSeleniumTask;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonCartValueValidation {

	private static int maxWaitTime = 30;

	private static String appUrl = "https://www.amazon.in";
	
	public static WebDriver driver;

	private static String searchKey = "One Plus Mobiles";

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();		

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(maxWaitTime));

		Actions action = new Actions(driver);

		JavascriptExecutor jScript = (JavascriptExecutor) driver;

		driver.get(appUrl);

		WebElement txtBox_search_homePage = wait.until(ExpectedConditions.visibilityOf
				(driver.findElement(By.id("twotabsearchtextbox"))));

		txtBox_search_homePage.sendKeys(searchKey);

		WebElement btn_search_homePage = wait.until(ExpectedConditions.visibilityOf
				(driver.findElement(By.id("nav-search-submit-button"))));

		btn_search_homePage.click();

		WebElement img_product1_searchResultPage = wait.until(ExpectedConditions.visibilityOf
				(driver.findElement(By.xpath("(//span[@data-component-type='s-product-image'])[1]"))));

		WebElement txt_priceProduct1_searchResultPage = wait.until(ExpectedConditions.visibilityOf
				(driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]"))));

		String priceProduct1 = txt_priceProduct1_searchResultPage.getText();

		System.out.println("Price of the first product on search result = "+priceProduct1);

		WebElement txt_ratingStar1_searchResultPage = wait.until(ExpectedConditions.visibilityOf
				(driver.findElement(By.xpath("(//span[@data-component-type='s-product-image'])[1]/following::i[1]"))));

		jScript.executeScript("arguments[0].scrollIntoView(true);", txt_ratingStar1_searchResultPage);

		//	action.moveToElement(txt_ratingStar1_searchResultPage).build().perform();
		// Mouse Over not working with this, so clicking on element

		txt_ratingStar1_searchResultPage.click();

		WebElement txt_ratingStarCount1_searchResultPage = wait.until(ExpectedConditions.visibilityOf
				(driver.findElement(By.id("acr-popover-title"))));

		WebElement txt_globalRatingCount1_searchResultPage = wait.until(ExpectedConditions.visibilityOf
				(driver.findElement(By.xpath("//span[contains(text(),'global ratings')]"))));

		String ratingCount = txt_ratingStarCount1_searchResultPage.getText();

		String globalRatingCount = txt_globalRatingCount1_searchResultPage.getText();

		System.out.println("Ratings "+ratingCount + " with total "+ globalRatingCount);

		img_product1_searchResultPage.click();

		Set <String> handles = driver.getWindowHandles();
		List <String> handlesList = new ArrayList<String>(handles);

		for (String desiredHandle : handlesList) {
			String title = driver.switchTo().window(desiredHandle).getTitle();

			if (title.contains("OnePlus Nord")) {
				System.out.println("Switched to desired tab");
			}
		}

		WebElement txt_productTitle_productPage = wait.until(ExpectedConditions.visibilityOf
				(driver.findElement(By.xpath("//span[@id='productTitle']"))));

		String productTitle = txt_productTitle_productPage.getText();

		System.out.println("Title of the product on product page = "+productTitle);


		WebElement txt_productPrice_productPage = wait.until(ExpectedConditions.visibilityOf
				(driver.findElement(By.xpath("//span[@id='productTitle']/following::span[19]"))));

		String productPrice = txt_productPrice_productPage.getText();

		System.out.println("Price of the product on product page = "+productPrice);

		WebElement btn_addToCart_productPage = wait.until(ExpectedConditions.visibilityOf
				(driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"))));

		btn_addToCart_productPage.click();		

		WebElement txt_productPrice_cartPage = wait.until(ExpectedConditions.visibilityOf
				(driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']"))));

		String cartPrice = txt_productPrice_cartPage.getText();

		System.out.println("Price of the product on cart page = "+cartPrice);

		if (cartPrice.contains(priceProduct1)) {
			System.out.println("Cart price has been validated with price on search results page");
		}
		else {
			System.out.println("Cart price validation failed with price on search results page");
		}
		if (cartPrice.contains(productPrice)) {
			System.out.println("Cart price has been validated with price on product page");
		}
		else {
			System.out.println("Cart price validation failed with price on product page");
		}
		
		driver.quit();
	}
	
	

}
