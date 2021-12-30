import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GoogleTest {
	
	WebDriver driver;
	SoftAssert var = new SoftAssert();
	
	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.google.com/");


		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@Test(priority = 1, groups = "Title")
	public void googleTitleTest() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);	
	}
	
	@Test(priority = 2, groups = "Logo")
	public void googleLogoTest() {
		boolean logo = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		assertEquals(logo, true);
	}
	
	@Test(priority = 3, groups = "Link")
	public void mailLinkTest() {
		boolean link = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isDisplayed();
	}
	
	@Test(priority = 4, groups = "Test")
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(priority = 5, groups = "Test")
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(priority = 6, groups = "Test")
	public void test3() {
		System.out.println("test3");
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	 
	}
	
}
