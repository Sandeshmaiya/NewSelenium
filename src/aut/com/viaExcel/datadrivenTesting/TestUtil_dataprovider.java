package aut.com.viaExcel.datadrivenTesting;

import java.util.ArrayList;
import com.excel.util.Xls_Reader;

public class TestUtil_dataprovider {

	public  static ArrayList <Object []> getDataFromExcel() {

		Xls_Reader exceldata = new Xls_Reader(System.getProperty("user.dir")
				+ "/src/dataprovider.xlsx");
		int rowcount = exceldata.getRowCount("Reg_page");
		
		ArrayList<Object []> mydata = new ArrayList<Object []>();

		for (int i = 2; i <= rowcount; i++) {

			String firstname = exceldata
					.getCellData("Reg_page", "firstname", i);
			String lastname = exceldata.getCellData("Reg_page", "lastname", i);
			String email = exceldata.getCellData("Reg_page", "email", i);
			String username = exceldata.getCellData("Reg_page", "username", i);
			String password = exceldata.getCellData("Reg_page", "password", i);
			
			Object ob [] ={firstname, lastname, email, username, password};
			mydata.add(ob);

		}
		
		return mydata;
	}

}
