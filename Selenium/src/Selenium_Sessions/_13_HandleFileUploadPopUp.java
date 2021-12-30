package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _13_HandleFileUploadPopUp {

	public static void main(String[] args) {

		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/upload/");
		
		// Don't click on the browse button
		// Inspect the browse button and give the path of the file
		// type=file should be present for Browse/AttachFile/UploadFile buttons
		driver.findElement(By.xpath("//input[@id='uploadfile_0']")).sendKeys("‪C:\\Users\\Ishani\\Desktop\\QA7.docx");

	}

}
