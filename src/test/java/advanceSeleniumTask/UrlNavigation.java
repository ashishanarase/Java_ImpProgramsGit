package advanceSeleniumTask;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UrlNavigation {

	public static WebDriver driver;

	private static String appUrl = "https://www.amazon.in";

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();		

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(appUrl);
		System.out.println("Amazon Navigation");

		SampleCommonMethods.titleValidation("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");

		driver.get("https://www.myntra.com/");

		System.out.println("Myntra Navigation");
		SampleCommonMethods.titleValidation("Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra");

	}

}
