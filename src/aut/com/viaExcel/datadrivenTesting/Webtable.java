package aut.com.viaExcel.datadrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.excel.util.Xls_Reader;

public class Webtable {

	static String flag = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions co = new ChromeOptions();
		co.addArguments("headless");

		System.setProperty("webdriver.chrome.driver",
				"C:/Sandesh/Selenium Downloded/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(co);

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		// *[@id="customers"]/tbody/tr[2]/td[1]
		// *[@id="customers"]/tbody/tr[3]/td[1]
		// *[@id="customers"]/tbody/tr[4]/td[1]

		Xls_Reader reader = new Xls_Reader(
				(System.getProperty("user.dir") + "/src/dataprovider.xlsx"));

		boolean sheetname = !(reader.isSheetExist("newSheet"));
		if (sheetname) {
			reader.addSheet("newSheet");
			reader.addColumn("newSheet", "Company");
			reader.addColumn("newSheet", "Contact");
			reader.addColumn("newSheet", "Country");
		}

		int rowcount = driver.findElements(
				By.xpath("//table[@id='customers']//tr")).size();

		int colcount = driver.findElements(
				By.xpath("//table[@id='customers']//th")).size();

		for (int j = 1; j <= colcount; j++) {
			for (int i = 2; i <= rowcount; i++) {
				String beforecompany = "//*[@id='customers']/tbody/tr[";
				String aftercompany = "]/td[";

				if (j == 1) {
					flag = "Company";

				} else if (j == 2) {
					flag = "Contact";

				} else
					flag = "Country";

				String newdata = driver.findElement(
						By.xpath(beforecompany + i + aftercompany + j + "]"))
						.getText();

				reader.setCellData("newSheet", flag, i, newdata);

			}

		}
		driver.quit();
	}

}
