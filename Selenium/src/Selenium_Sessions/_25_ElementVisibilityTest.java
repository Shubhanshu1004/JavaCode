package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _25_ElementVisibilityTest {

	public static void main(String[] args) {

		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://register.freecrm.com/register/");
		
		// 1. isDisplayed() method: Applicable for all the elements
		// Whether a particular element is displayed or not
		// Returns true if displayed otherwise returns false
		boolean b = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		System.out.println(b);
		
		// 2. isEnabled() method: Primarily used with buttons
		// Verify if the Web element is enabled or disabled within the webPage
		boolean b1 = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		System.out.println(b1);
		
		// 3. isSelected() method: Applicable only for check box, drop down and radio buttons
		// Verify if the element is checked or not 
		boolean b2 = driver.findElement(By.xpath("//input[@class='search']")).isSelected();
		System.out.println(b2);
		boolean b3 = driver.findElement(By.xpath("//input[@id='terms']")).isSelected();
		System.out.println(b3);
		
	}

}