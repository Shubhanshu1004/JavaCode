package Selenium_Sessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class _2_TakeScreenshotConcept {
	
	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		// We can take screenshot in selenium  using getScreenshotAs() method
		// Take Screenshot and store as a file format
	    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				
		// now keep the screenshot to desired location using copyFile() method
	    Files.copy(src, new File("C:\\Users\\Ishani\\Desktop\\Selenium\\google.jpg"));
		
	

	}

}
