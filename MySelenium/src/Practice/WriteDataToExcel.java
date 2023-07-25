package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//get the java representative object of the physical file
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
//		open the workbook or create workbook
		Workbook w = WorkbookFactory.create(fis);
//		get the control of the sheet, then row, then cell then type the data
		w.getSheet("createcustomer").getRow(1).getCell(5).setCellValue("pass");
//		get the physical file of the java representative object
     //		FileOutputStream fos = FileOutputStream("./data/testsctipt.xlsx");
//		FileOutputStream fos = FileOutputStream("./data/testscript.xlsx");
//		save the workbook(actual writting happers here)
     //		w.write(fos);
	}

}
