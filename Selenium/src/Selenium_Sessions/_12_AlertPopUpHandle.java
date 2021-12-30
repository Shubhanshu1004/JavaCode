package Selenium_Sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Three different types of popups
// 1. Alerts pop up or javascript pop up
// To handle this we will use Alert API
// 2. File upload pop up
// If type=file is there we will use sendKeys and will send the path
// 3. Browser window pop up or advertisement pop up
// we have to use WindowHandler API (getWindowHandles method is there)
public class _12_AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// We can't handle alert popups using locators
		// Without entering email id and password, we are clicking on sign in button
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		
		// To switch the control to alert message window
		Alert alert = driver.switchTo().alert();
		
		// To get the text available on alert window
		System.out.println(alert.getText());
		
		// If OK button is available
		// To click on OK button
		alert.accept();
		
		// If cancel button is available
		// To click on cancel button
		//alert.dismiss();
		
		String text = alert.getText();
		if(text.equals("Please enter a valid user name"))
		{
			System.out.println("Correct alert message");
		}
		else
		{
			System.out.println("Incorrect alert message");
		}	

	}

}
