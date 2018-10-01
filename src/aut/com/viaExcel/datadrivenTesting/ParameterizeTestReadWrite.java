package aut.com.viaExcel.datadrivenTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.util.Xls_Reader;

public class ParameterizeTestReadWrite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/register/");
		
		Thread.sleep(3000l);
		
		Xls_Reader exceldata= new Xls_Reader(System.getProperty("user.dir")+"/src/dataprovider.xlsx");
		 int rowcount =exceldata.getRowCount("Reg_page");
		 
		 exceldata.addColumn("Reg_page", "Status");
		
		for (int i=2; i<=rowcount;i++){
			
			String fristname = exceldata.getCellData("Reg_page", "firstname", i);
			String lastname = exceldata.getCellData("Reg_page", "lastname", i);
			String email= exceldata.getCellData("Reg_page", "email", i);
			String username = exceldata.getCellData("Reg_page", "username", i);
			String password = exceldata.getCellData("Reg_page", "password", i);
			
			
			
			
			driver.findElement(By.name("first_name")).clear();
			driver.findElement(By.name("first_name")).sendKeys(fristname);
			
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
			
			exceldata.setCellData("Reg_page", "Status", i, "Pass");
			// If you have to Run this code again den make sure you delete the column and run this code.
			
		}

	}

}
