package ReadExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//To specify the path of the excel file
		 FileInputStream fis = new FileInputStream("./data/testData.xlsx");
		 
		 //to make the file ready to read
		  Workbook wb = WorkbookFactory.create(fis);
		  
		  
		Sheet sheet = wb.getSheet("ipl");//To get into the sheet
		
		Row row = sheet.getRow(5);//to get into the row
		
		Cell cell = row.getCell(0);//to get into the cell
		
		String data = cell.getStringCellValue();//to read the data from the cell
		System.out.println(data);
	}

}
