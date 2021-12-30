import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	/*
	@BeforSuite --> setup system properties for chrome
	@BeforeTest --> launchBrowser
	@BeforeClass --> login
	
	@BeforeMethod --> enter URL
	@Test --> googleLogoTest
	@AfterMethod --> logout
	
	@BeforeMethod --> enter URL
	@Test --> googleTitleTest
	@AfterMethod --> logout
	
	@BeforeMethod --> enter URL
	@Test -->searchTest
	@AfterMethod --> logout
	
	@AfterClass --> close the browser
	@AfterTest --> delete all cookies
	PASSED: googleLogoTest
	PASSED: searchTest
	PASSED: googleTitleTest
	 */
	
	//Pre-requisite annotations --> starting with @Before
	@BeforeSuite // 1
	public void setUp() {
		System.out.println("setup system properties for chrome");
	}

	@BeforeTest // 2
	public void launchBrowser() {
		System.out.println("launchBrowser");
	}
	
	@BeforeClass // 3
	public void login() {	
		System.out.println("login");
	}
	
	@BeforeMethod() // 4
		public void enterURL() {
			System.out.println("enter URL");
		}
	
	//test cases annotations --> starting with @Test
	@Test // 5
	public void googleTitleTest() {
		System.out.println("googleTitleTest");
	}

	@Test
	public void searchTest() {
		System.out.println("searchTest");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("googleLogoTest");
	}
	
	//Post-conditions annotations -- starting with @After
	@AfterMethod // 6
	public void logOut() {
		System.out.println("logout");
	}
	
	@AfterClass // 7
	public void closeBrowser() {
		System.out.println("close the browser");
	}

	
	@AfterTest // 8
	public void deleteAllCookies() {
		System.out.println("delete all cookies");
	}
		
	@AfterSuite
	public void generateTestReport() {
		System.out.println("generateTestReport");
	}
	
}
