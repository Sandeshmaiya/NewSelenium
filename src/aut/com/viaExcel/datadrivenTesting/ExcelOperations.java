package aut.com.viaExcel.datadrivenTesting;

import com.excel.util.Xls_Reader;

public class ExcelOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xls_Reader exceldata= new Xls_Reader(System.getProperty("user.dir")+"/src/dataprovider.xlsx");
		//exceldata.addSheet("marvel");
		
		
		if(!(exceldata.isSheetExist("marvel"))){
			exceldata.addSheet("marvel");
			
		}
		
		System.out.println(exceldata.getColumnCount("Reg_page"));//column count
		
		//exceldata.addHyperLink(sheetName, screenShotColName, testCaseName, index, url, message);
	}

}
