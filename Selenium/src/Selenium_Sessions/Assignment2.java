package Selenium_Sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nicesnippets.com/live/bootstrap-4-multi-level-dropdown-menu-on-hover-demo.html");
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		action.moveToElement(driver.findElement(By.linkText("Cources "))).build().perform();
		
		action.moveToElement(driver.findElement(By.linkText("Information Technology(IT)"))).build().perform();
		
	    //driver.findElement(By.linkText("B.C.A")).click();

	}

}
