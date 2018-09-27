package openPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLcertification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//General chrome profile
		
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();		
		ch.acceptInsecureCerts();	
		
		// to Add more puglins (Other way of Handling Certifications)
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions c = new ChromeOptions();
		
		//Local Chrome Profile
		c.merge(ch);		
		System.setProperty("webdriver.chrome.driver", "C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);	
		
	}

}
