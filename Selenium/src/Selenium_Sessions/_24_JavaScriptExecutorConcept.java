package Selenium_Sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _24_JavaScriptExecutorConcept {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		driver.get("https://freecrm.com/");
		
		WebElement loginButton = driver.findElement(By.xpath("//span[contains(text(),'sign up')]")); 
	
		flash(loginButton, driver);	

	}
	
	public static void flash(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String bgcolour = element.getCssValue("backgroundcolour");
		for(int i=0; i<10; i++)
		{
			changeColour("rgb(0,200,0)", element, driver);
			changeColour(bgcolour, element, driver);
		}
	}
	
	public static void changeColour(String colour, WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundcolour = "+colour, element);
		try 
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			
		}
	}

}
