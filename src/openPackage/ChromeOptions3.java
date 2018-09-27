package openPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		ChromeOptions  options = new ChromeOptions();
		options.addArguments("headless");
		System.setProperty("webdriver.chrome.driver", "C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://freecrm.com");
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("sandeshmaiya");
		driver.findElement(By.name("password")).sendKeys("sandesh1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
	}

}
