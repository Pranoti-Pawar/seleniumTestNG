package com.pranoti.selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Xmlfile {
	@DataProvider(name= "excel")
	public static Object[][] readExcelData() throws IOException{
		
		String filepath = "D:\\PranotiWorkspace\\seleniumTestNG\\src\\test\\resources\\logindata1.xlsx";
		//D:\PranotiWorkspace\seleniumTestNG\src\test\resources
		FileInputStream file = new FileInputStream(filepath);
		Workbook wb = new XSSFWorkbook(file);

	 
		Sheet sheet = wb.getSheet("Sheet1");
		
	
		
		int rows = sheet.getPhysicalNumberOfRows();	 // total row	

		int cols = sheet.getRow(0).getPhysicalNumberOfCells();

		Object [][] data = new Object[rows-1][cols];
		
		for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i-1][j] =   getCellData(sheet, i, j);
            }
        }
        return data;
			
	}
	 public static String getCellData(Sheet sheet,int rowNum, int colNum) {
	        DataFormatter formatter = new DataFormatter();
	        return formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
	    }
	
	

	@Test(dataProvider="excel")
	public void excelData(String username , String password) {
			System.out.println(username);
			System.out.println(password);
	}
}
