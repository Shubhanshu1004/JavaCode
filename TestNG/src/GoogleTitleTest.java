import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GoogleTitleTest {

	WebDriver driver;
	SoftAssert var = new SoftAssert();
	
	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.google.com/");


		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void googleTitleTest() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);	
		
		Assert.assertEquals(actualTitle, "Google", "Title is not matched");
		
	}
	
	@Test
	public void googleLogoTest() {
		boolean logo = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		
		// Both are same
		Assert.assertTrue(logo, "Logo is not displayed");
		Assert.assertEquals(logo, true, "Logo is not displayed");
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	 
	}
		
}
