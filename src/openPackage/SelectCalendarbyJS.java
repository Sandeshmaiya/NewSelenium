package openPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalendarbyJS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.get("http://www.durgambabooking.com/"); // enter URL
		//WebElement date = driver.findElement(By.xpath("//input[@id='searchbus_depart']"));
		
		driver.get("https://www.spicejet.com/");
		
		//Only if it Contains value Attribute then we can have this code else we have loop and get the Object or we have to
		
		Thread.sleep(7000l);
		
		WebElement date = driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date1']/following-sibling::input[@id='ctl00_mainContent_txt_Fromdate']"));
		String dateVal = "30-12-2028";
		
		selectDateByJS(driver, date, dateVal);
		
		driver.findElement(By.xpath("//span[@id='view_fulldate_id_1']//preceding-sibling::button[@class='ui-datepicker-trigger']")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();

	}
	
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
		
	}
	
	
	

}
