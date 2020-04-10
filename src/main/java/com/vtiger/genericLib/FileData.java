package com.vtiger.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileData {
	public String fetchDataFromProperty(String key) throws IOException {
		FileInputStream file = new FileInputStream
								("./src/test/resources/CommonData.properties");
		Properties pobj = new Properties();
		pobj.load(file);
		String value = pobj.getProperty(key);
		return value;
	}

	public String fetchDataFromExcel(String sheetname, int rownum, 
								int cellnum) throws IOException {
		FileInputStream file = new FileInputStream
							("./src/test/resources/TestCaseData.xlsx");

		Workbook book = WorkbookFactory.create(file);
		Sheet sh = book.getSheet(sheetname);
		Row row = sh.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String value = cell.getStringCellValue();
		return value;
	}

	public void addDataInExcel(String sheetname, int rownum, 
					int cellnum , String newData) throws IOException {
		FileInputStream file = new FileInputStream
								("TestCaseData.xlsx");

		Workbook book = WorkbookFactory.create(file);
		Sheet sh = book.getSheet(sheetname);
		Row ro = sh.createRow(rownum);
		Cell cel = ro.createCell(cellnum);
		cel.setCellValue(newData);

		FileOutputStream out = new FileOutputStream
									("D:\\TestData\\TestCaseData.xlsx");

		book.write(out);
		out.flush();
		System.out.println("New Data Added");
	}
}
