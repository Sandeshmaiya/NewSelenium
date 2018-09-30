package openPackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksTests {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://freecrm.com");
		Thread.sleep(3000l);
		driver.findElement(By.name("username")).sendKeys("sandeshmaiya");
		driver.findElement(By.name("password")).sendKeys("sandesh1");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(3000l);
		
		driver.switchTo().frame("mainpanel");
		List <WebElement> linklists= driver.findElements(By.tagName("a"));
		linklists.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Total links and images are --->"+ linklists.size());
		
		List <WebElement> activelinks = new ArrayList<WebElement>();
		
		for(int i=0 ;i<linklists.size();i++){
			if(linklists.get(i).getAttribute("href")!= null &&!(linklists.get(i).getAttribute("href").contains("javascript"))){
				activelinks.add(linklists.get(i));
			}
			
		}
		System.out.println("Active links and images are --->"+ activelinks.size());
		for(int j=0 ;j<activelinks.size();j++){
			
			HttpURLConnection connenction = (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
			connenction.connect();
			String res =connenction.getResponseMessage();
			connenction.disconnect();
			System.out.println(activelinks.get(j).getAttribute("href") +"--->"+ res);
			
		}
		
		
		
		
		
	}

}
