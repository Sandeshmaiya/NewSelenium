package openPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {
	
	public static void main(String args[]) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		Actions actions = new Actions(driver);		
		driver.get("https://www.spicejet.com//");
		
		actions.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
		
		Thread.sleep(3000l);
		
		driver.findElement(By.linkText("You 1st")).click();
	
		
		
		
	}

}
