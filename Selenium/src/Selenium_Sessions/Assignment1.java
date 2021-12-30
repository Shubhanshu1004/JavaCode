package Selenium_Sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
	
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26adgrpid%3D58355126069%26ext_vrnc%3Dhi%26gclid%3DCjwKCAjw7rWKBhAtEiwAJ3CWLNmilayz-HfOBb5eCZ4hVRQXwdy9GawTIZ1giWXGDuQQkrRIbaMywhoCOqMQAvD_BwE%26hvadid%3D486386870127%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9299442%26hvnetw%3Dg%26hvpone%3D%26hvpos%3D%26hvptwo%3D%26hvqmt%3De%26hvrand%3D6196437157476867544%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2154373%26ref%3Dpd_sl_7hz2t19t5c_e%26tag%3Dgooghydrabk1-21%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("Anshu Dubey");
		
		driver.findElement(By.xpath("//*[@id=\"ap_phone_number\"]")).sendKeys("9876543210");
		
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("anshu.12345@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("ansh@1004");
	
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();

	

	}

}
