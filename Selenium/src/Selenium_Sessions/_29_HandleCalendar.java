package Selenium_Sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _29_HandleCalendar {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		String monthYearValue = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthYearValue);
		
		String month = monthYearValue.split("")[0].trim();
		String year = monthYearValue.split("")[1].trim();
	
		while(!(month.equals("June") && year.equals("2023"))) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			monthYearValue = driver.findElement(By.className("ui-datepicker-title")).getText();
			System.out.println(monthYearValue);
			
			month = monthYearValue.split("")[0].trim();
			year = monthYearValue.split("")[1].trim();
				
		}
			
		driver.findElement(By.xpath("//a[text()='23']")).click();
	
	
	}
	
	

}
