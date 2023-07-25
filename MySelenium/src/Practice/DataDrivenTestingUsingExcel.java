package Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenTestingUsingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		get the java representative object of the physical file
		FileInputStream f = new FileInputStream("./data/TestScript.xlsx");
//		open the workbook of create the workbook
		Workbook wb = WorkbookFactory.create(f);
		String data = wb.getSheet("createcustomer").getRow(1).getCell(3).getStringCellValue();
		System.out.println(data);
	}

}
