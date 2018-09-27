package openPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public abstract class HeadlessBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		HtmlUnitDriver driver = new HtmlUnitDriver();
//		System.setProperty("webdriver.chrome.driver", "C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com");
		Thread.sleep(7000l);
		
		driver.findElement(By.name("username")).sendKeys("sandeshmaiya");
		driver.findElement(By.name("password")).sendKeys("sandesh1");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		System.out.println(driver.getTitle());

	}

}
