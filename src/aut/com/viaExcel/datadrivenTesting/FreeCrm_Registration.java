package aut.com.viaExcel.datadrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.util.Xls_Reader;

public class FreeCrm_Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xls_Reader exceldata= new Xls_Reader(System.getProperty("user.dir")+"/src/dataprovider.xlsx");
		String fristname = exceldata.getCellData("Reg_page", "firstname", 2);
		String lastname = exceldata.getCellData("Reg_page", "lastname", 2);
		String email= exceldata.getCellData("Reg_page", "email", 2);
		String username = exceldata.getCellData("Reg_page", "username", 2);
		String password = exceldata.getCellData("Reg_page", "password", 2);
		
		
		System.out.println(email + " " +password );
		
		
	
	}

}
