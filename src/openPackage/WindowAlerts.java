package openPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("http://html.com/input-type-file/");
		
		Thread.sleep(4000l);// Do not Click on Browse button to Upload the file
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:/Users/s.maiya/Downloads/doc (3).txt");

	}

}
