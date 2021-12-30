package Selenium_Sessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Another window will be opened
// Another webpage will be opened
public class _21_HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2017/05/blog-post.html");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),' Click here for Facebook ')]")).click();
		
		Set<String> handler = driver.getWindowHandles();
	
		Iterator<String> itr = handler.iterator();
		
		String parentWindowId = itr.next();
		System.out.println(parentWindowId);
		
		String childWindowId = itr.next();
		System.out.println(childWindowId);
		
		driver.switchTo().window(childWindowId);
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		// Don't use quit(), because it will close both the browsers
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		Thread.sleep(3000);
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		
	}

}
