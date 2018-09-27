package openPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrap_DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_1");
		
//		driver.findElement(By.xpath("//button[@class ='multiselect dropdown-toggle btn btn-default']")).click();
//		
//		List<WebElement> dropdownValues = driver.findElements(By.xpath("//ul//li/a/label"));
		
		driver.get("https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_4");
		Thread.sleep(3000);	
		
		driver.findElement(By.id("btnDropdownDemo")).click();
		
		
		List<WebElement > dropdownValues =driver.findElements(By.xpath("//div[contains(@class, 'dropdown-menu show')]//a[@class='dropdown-item']"));
		
		Thread.sleep(3000);
		System.out.println(dropdownValues.size());
		
		for(int i=0; i<dropdownValues.size();i++){
						
			String values = dropdownValues.get(i).getText();
			System.out.println(values);
			//dropdownValues.get(i).click();
			
			
			
		}
		
		
		
		
		//button[contains(@class, 'btn btn-warning dropdown-toggle')]
		
		

	}

}
