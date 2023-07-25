package com.projectname.generic;

import java.awt.RenderingHints.Key;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi.withSha224;
import org.openqa.selenium.Keys;

public class FileLibrary {

	private static final String Key = null;

	public static String main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/.property");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(Key);
		return data;
	}

	public String getExcelName(String sheetName, int row, int cell, String path)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}

	public void setExcelData(String sheetName, int row, int cell, String data, String path)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		FileOutputStream fos = new FileOutputStream("./data/testscript.xlsx");
		wb.write(fos);

	}

}
