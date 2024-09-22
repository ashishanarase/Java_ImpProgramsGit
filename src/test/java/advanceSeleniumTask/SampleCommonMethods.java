package advanceSeleniumTask;

import junit.framework.Assert;

public class SampleCommonMethods extends UrlNavigation {
	
	public static void titleValidation(String expectedTitle) {
		
		String actualTitle = driver.getTitle();
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title validation successful");
		}
		else {
			System.out.println("Error-Title might be changed");
		}
		
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}

}
