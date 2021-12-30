package Selenium_Sessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.URL;

public class _31_BrokenLinkTest {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://seleniumpractise.blogspot.com/2021/11/broken-links-and-images.html");
		
		// To get all the links in a web page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		// To add all the images in the existing list
		links.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("size of full links and images " + links.size());
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		// iterate links --> exclude all the links/images which doesn't have any href attribute
		for(int i=0; i<links.size(); i++) {
			if(links.get(i).getAttribute("href") != null) {
				activeLinks.add(links.get(i));
			}
		}
		
		// To get the size of active links list
		System.out.println("size of active links and images " + activeLinks.size());
		
		// check the href url, with httpconnection api --> present in java.net package
		for (int j=0; j<activeLinks.size(); j++) {
			
			//create URL class object and cast it into HttpURLConnection class 
			
			
		}
		
		
	}

}
