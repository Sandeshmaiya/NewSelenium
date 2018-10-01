package aut.com.viaExcel.datadrivenTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.util.Xls_Reader;

public class FreeCrm_Registration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Xls_Reader exceldata= new Xls_Reader(System.getProperty("user.dir")+"/src/dataprovider.xlsx");
		//exceldata.setCellData("Reg_page", "firstname", 2, "maiya0--100");
		String fristname = exceldata.getCellData("Reg_page", "firstname", 2);
		String lastname = exceldata.getCellData("Reg_page", "lastname", 2);
		String email= exceldata.getCellData("Reg_page", "email", 2);
		String username = exceldata.getCellData("Reg_page", "username", 2);
		String password = exceldata.getCellData("Reg_page", "password", 2);
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/register/");
		
		Thread.sleep(3000l);
		
		driver.findElement(By.name("first_name")).sendKeys(fristname);
		driver.findElement(By.name("surname")).sendKeys(lastname);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("email_confirm")).sendKeys(email);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("passwordconfirm")).sendKeys(password);
		
		
	
	}

}
