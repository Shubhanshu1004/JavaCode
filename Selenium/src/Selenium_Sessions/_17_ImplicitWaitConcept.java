package Selenium_Sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _17_ImplicitWaitConcept {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.ebay.com/");
		
		// To give time to the page to be loaded completely otherwise exception will be raised 
		// This is dynamic in nature i.e. if page is loaded completely within 2 seconds remaining time will be ignored
		// sleep() is static in nature
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		// This method is for all elements to load completely
		// Sometimes page is fully loaded but elements(like some image or drop down button etc) take time to load
		// This is dynamic in nature
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

}
