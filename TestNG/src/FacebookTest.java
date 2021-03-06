import static org.testng.Assert.assertEquals;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// TestNG --> unit test framework
// Also called TDD framework --> Test Driven Development  
// purpose --> 1. designing test cases in a systematic way
//             2. To generate HTML reports
//             3. Different annotations
//			   4. Give priorities/sequences to the test cases
//  	       5. can define different dependencies
//			   6. Grouping
//			   7. Data provider --> To execute a particular test case again and again for different set of data 
// TestNG --> open source, free, available in JAR files
// Java unit testing framework
// TestNG and JUnit both are used only with java --> Both are java testing framework

public class FacebookTest {
	
	public WebDriver driver;

	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	public void logIn() {
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anshu.dubey4@gmail.com");;
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("anshu@1004");;
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		assertEquals(actualTitle, "Facebook");
		
	}
	
	@Test
	public void verifyElementVisibility() {
		
		boolean b = driver.findElement(By.xpath("//span[contains(text(),'Can You Escape')]")).isDisplayed();
		
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.close();
			
	}
	
	
}
