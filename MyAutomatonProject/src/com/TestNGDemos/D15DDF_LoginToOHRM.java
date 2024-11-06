package com.TestNGDemos;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D15DDF_LoginToOHRM {
	String fPath = "ExcelFiles\\LoginData.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@Test(dataProvider = "getLoginData")
	public void login(String un, String ps) {
		System.out.println(un);
		System.out.println(ps);
	}
	@AfterMethod
	public void afterMethod() {
	}


	@DataProvider
	public Object[][] getLoginData() {
		int rows = sheet.getPhysicalNumberOfRows();
		String[][]loginData = new String[rows-1][2];
		
		for(int i = 0; i < rows-1; i++)
		{
			row = sheet.getRow(i+1);
			for(int j = 0; j < 2; j++)
			{
				cell = row.getCell(j);
				loginData[i][j] = cell.getStringCellValue();
			}
		}
		return loginData;
	}
	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.close();
		fis.close();
	}

}