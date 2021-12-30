package Selenium_Sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class _23_HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		// HtmlUnitDriver is a class in Selenium which implements WebDriver interface
		// HtmlUnitDriver is not available in Selenium 3.x version
		// To use HtmlUnitDriver, we have to download HtmlUnitDriver JAR file
		
		// Advantages:
		// 1. Testing happens behind the scene i.e. no browser will be launched
		// 2. Execution of the test cases is very fast--->> performance of the script improved
		// 3. not suitable for Actions class-->user actions--> mouse movement, double click, drag & drop
		// 4. Ghost Driver--> Headless browser
		
		// HtmlUnitDriver--> for java
		// PhantomJS--> for javaScript
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_AccountFlyout_signout%26signIn%3D1%26useRedirectOnSuccess%3D1");
		
		System.out.println("Before login, title is: "+driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("ishanit.0801@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ishani1004");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		Thread.sleep(5000);
		
		System.out.println("After login, title is: "+driver.getTitle());


	}

}