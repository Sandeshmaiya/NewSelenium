package aut.com.viaExcel.datadrivenTesting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Dataprovider_Excel {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		

		System.setProperty("webdriver.chrome.driver",
				"C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/register/");
		
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	
	@Test(dataProvider ="getData")
	public void freecrmregistrationpage(String firstname, String lastname, String email, String username, String password){
		driver.findElement(By.name("first_name")).clear();
		driver.findElement(By.name("first_name")).sendKeys(firstname);
		
		driver.findElement(By.name("surname")).clear();
		driver.findElement(By.name("surname")).sendKeys(lastname);
		
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(email);
		
		driver.findElement(By.name("email_confirm")).clear();
		driver.findElement(By.name("email_confirm")).sendKeys(email);
		
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(username);
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.name("passwordconfirm")).clear();
		driver.findElement(By.name("passwordconfirm")).sendKeys(password);
	}
	
	@DataProvider
	public Iterator<Object[]> getData(){
		ArrayList<Object[]>  testdata =TestUtil_dataprovider.getDataFromExcel();
		return testdata.iterator();
		
	}
	 
	
		
		
	
}
