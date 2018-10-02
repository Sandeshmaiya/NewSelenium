package openPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
;

public class FirefoxHeadless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		FirefoxBinary fb = new 	FirefoxBinary();
//		fb.addCommandLineOptions("headless");
//		System.setProperty("webdriver.gecko.driver", "C:\\Sandesh\\Selenium Downloded\\geckodriver\\geckodriver.exe");
//		
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.setBinary(fb);
//		
//		WebDriver driver = new FirefoxDriver(fo);
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("headless");
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
		

	}

}
