package Selenium_Sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _26_DynamicWebTableHandle1 {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// To handle web table in Selenium
		// Method 1:
		// Iterate row and column and get the cell value
		// Using for loop
		// Get total rows and iterate table
		// Put if(String matches) then select the value
		// Lengthy method
		
		// Handling webTable using 1st method:
		// Absolute xPaths:
		// //*[@id="customers"]/tbody/tr[2]/td[2]
		// //*[@id="customers"]/tbody/tr[3]/td[2]
		// //*[@id="customers"]/tbody/tr[4]/td[2]
		// //*[@id="customers"]/tbody/tr[5]/td[2]
		// //*[@id="customers"]/tbody/tr[6]/td[2]
		// //*[@id="customers"]/tbody/tr[7]/td[2]
		
		String before_xPath = "//*[@id=\"customers\"]/tbody/tr[";
		String after_xPath = "]/td[2]";
		
		for(int i=2; i<=7; i++)
		{
			String company = driver.findElement(By.xpath(before_xPath + i + after_xPath)).getText();
			System.out.println(company);
			if(company.contains("Jenkins"))
			{
				// //*[@id="customers"]/tbody/tr[6]/td[1]/input
				driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[" + i + "]/td[1]/input")).click();
			}
			
		}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
