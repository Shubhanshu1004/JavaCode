package Selenium_Sessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _19_FindElementsConcept {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");		
		
		// Targets
		// 1. get the total counts of links on the page
		// 2. get the text of each link on the page
		
		// All the links are represented by <a> HTML tag
		List<WebElement> list = driver.findElements(By.tagName("a"));
	    System.out.println(list);
		
	    System.out.println(list.size());
		
		// Blank links could also be there on the page having no text
		for(int i=0; i<list.size();i++)
		{
			String listText = list.get(i).getText();
			System.out.println(listText);
		}
	
	}

}
