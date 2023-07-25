package com.actitime.generic1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.xml.crypto.Data;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getPropertyData(String Key) throws IOException  {
		FileInputStream fis = new FileInputStream("./data/data.property");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(Key);
		return data;
		}
	public String getExcelData(String sheetName,int r,int c) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		Workbook  wb =  WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(r).getCell(c).getStringCellValue();
		return data;			
	}
}
