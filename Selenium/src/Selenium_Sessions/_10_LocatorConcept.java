package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _10_LocatorConcept {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://signup.ebay.com/pa/crte?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&AppName=LithiumT-7567-42e3-a620-0b7cf8ee50ee&ru=https%3A%2F%2Fauth.ebay.com%2Foauth2%2Fconsents%3Fclient_id%3DLithiumT-7567-42e3-a620-0b7cf8ee50ee%26redirect_uri%3DLithium_Technol-LithiumT-7567-4-khvro%26scope%26state%3D9SGCrXwhZVdbm_YytjkWpWjqamanIgUQ07E5BUzYwX5dybhsrDjGsL7VY6VC31XefUIdqLeNCPmG-XfbIiz55n2CcvXl_RmlKaa1UsIXJ5CrukbyU6kLSsNvPF-dbMEXp8ZPy0yenxx-dtB6UiBDW_I2detWEDCp89VV2VFgyA-Y1asoV18DkejQo9rt39b1oT67COnvZsoOsS4wX-euxA%26response_type%3Dcode%26hd%26consentGiven%3Dfalse&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26AppName%3DLithiumT-7567-42e3-a620-0b7cf8ee50ee%26ru%3Dhttps%253A%252F%252Fauth.ebay.com%252Foauth2%252Fconsents%253Fclient_id%253DLithiumT-7567-42e3-a620-0b7cf8ee50ee%2526redirect_uri%253DLithium_Technol-LithiumT-7567-4-khvro%2526scope%2526state%253D9SGCrXwhZVdbm_YytjkWpWjqamanIgUQ07E5BUzYwX5dybhsrDjGsL7VY6VC31XefUIdqLeNCPmG-XfbIiz55n2CcvXl_RmlKaa1UsIXJ5CrukbyU6kLSsNvPF-dbMEXp8ZPy0yenxx-dtB6UiBDW_I2detWEDCp89VV2VFgyA-Y1asoV18DkejQo9rt39b1oT67COnvZsoOsS4wX-euxA%2526response_type%253Dcode%2526hd%2526consentGiven%253Dfalse");
		
		// 1. xpath
		// Absolute xpath should not be used - hierarchy based xpath
		// Only relative xpath should be used.
//	    driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Anshu");
//		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Dubey");
//		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("anshu.dubey@gmail.com");
//		
		// 2. id
//		driver.findElement(By.id("firstname")).sendKeys("Anshu");
//		driver.findElement(By.id("lastname")).sendKeys("Dubey");
//		driver.findElement(By.id("Email")).sendKeys("anshu.ssss@gmail.com");
//		
		// 3. name
//		driver.findElement(By.name("firstname")).sendKeys("Anshu");
//		driver.findElement(By.name("lastname")).sendKeys("Dubey");
//		driver.findElement(By.name("Email")).sendKeys("anshu.dudhdh@gmail.com");
//		
		// 4. linkText
//		driver.findElement(By.linkText("User Agreement")).click();
//		
		// 5. partialLinkText: Not recommended to use
//		driver.findElement(By.partialLinkText("User Privacy")).click();
//		
		// 6. CSSSelector
		// If id is there---- #(id)
		// If class is there---- .(class)
//		driver.findElement(By.cssSelector("#Email")).sendKeys("anshu.frsgrg@gmail.com");
//		
		// 7. className: Not recommended to use
		driver.findElement(By.className("textbox__control textbox__control--underline")).sendKeys("ans.dub@gmail.com");

	

	}

}
