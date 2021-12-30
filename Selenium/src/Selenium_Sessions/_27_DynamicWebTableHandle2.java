package Selenium_Sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _27_DynamicWebTableHandle2 {
	
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// To handle web table in Selenium
		// Method 2:
		// Using custom xPath
		// Using parent and preceding siblings tags
		// No need to write for loop
		// Single line statement
		// More dynamic
		// Efficient and fast
		
		// Handling web Table using 2nd method:
		driver.findElement(By.xpath("//td[contains(text(),'Jenkins')]//preceding-sibling::td//input[@type='checkbox']")).click();
				
		
		
		
		
		
	}

}
