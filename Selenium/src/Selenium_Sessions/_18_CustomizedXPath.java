package Selenium_Sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _18_CustomizedXPath {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://signup.ebay.com/pa/crte?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&AppName=LithiumT-7567-42e3-a620-0b7cf8ee50ee&ru=https%3A%2F%2Fauth.ebay.com%2Foauth2%2Fconsents%3Fclient_id%3DLithiumT-7567-42e3-a620-0b7cf8ee50ee%26redirect_uri%3DLithium_Technol-LithiumT-7567-4-khvro%26scope%26state%3DZNbWH15FirPiVDNQb3pFwP2rMUlsChLACFyNE3Nta1ie9aDzwPg40rBWKQlRxdR95Ws5kMuVLY9u4wvPGBQRvXeKkCCnSsM1cYzfMd_hdm6BmOslmYDn_VwZfCNdgWuNZcltyAEWl_846TVJrQrGUkZug_Ohp7vbBhBj-05BHrNv_ps7DV77yUC42J5g3YFYQIvkcRPXAm7onfWBeuc25Q%26response_type%3Dcode%26hd%26consentGiven%3Dfalse&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26AppName%3DLithiumT-7567-42e3-a620-0b7cf8ee50ee%26ru%3Dhttps%253A%252F%252Fauth.ebay.com%252Foauth2%252Fconsents%253Fclient_id%253DLithiumT-7567-42e3-a620-0b7cf8ee50ee%2526redirect_uri%253DLithium_Technol-LithiumT-7567-4-khvro%2526scope%2526state%253DZNbWH15FirPiVDNQb3pFwP2rMUlsChLACFyNE3Nta1ie9aDzwPg40rBWKQlRxdR95Ws5kMuVLY9u4wvPGBQRvXeKkCCnSsM1cYzfMd_hdm6BmOslmYDn_VwZfCNdgWuNZcltyAEWl_846TVJrQrGUkZug_Ohp7vbBhBj-05BHrNv_ps7DV77yUC42J5g3YFYQIvkcRPXAm7onfWBeuc25Q%2526response_type%253Dcode%2526hd%2526consentGiven%253Dfalse");
		
//		driver.findElement(By.xpath("//input[@class='textbox__control textbox__control--underline']")).sendKeys("Anshu");
		
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anshu");
		
//		driver.findElement(By.xpath("//input[@error='Please enter your first name']")).sendKeys("Anshu");
		
		// Dynamic id --> Everytime when we load or refresh any page or open the page again id is getting changed.
		// id = test_123
		// id = test_456
		// id = test_789
		// id = test_test_789_test
		// can't use starts-with() method in these two cases below
		// id = 1234_test_t
		// id = 2345_test_t
		
		
		// This line ignores the dynamic part 123 or 456 or 789. can be handled using contains() method
		driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("test");
		
		// Another way to handle dynamic id
		driver.findElement(By.xpath("//input[starts-with(@id,test_)]")).sendKeys("Test");
		
		// One more way to handle dynamic id
		driver.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendKeys("Test");

	}

}
