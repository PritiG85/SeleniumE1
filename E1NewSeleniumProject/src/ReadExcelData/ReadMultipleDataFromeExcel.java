package ReadExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromeExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		
		//for read multiple data from excel sheet
		for (int i = 1; i <= 10; i++) {
			
			//To specify the path of the excel file
			FileInputStream fis = new FileInputStream("./data/testData.xlsx");
			
			
			Workbook wb = WorkbookFactory.create(fis);
			
			Sheet sheet = wb.getSheet("ipl");//To get into the sheet
			
			Row row = sheet.getRow(i);//to get into the row
			
			Cell cell = row.getCell(1);//to get into the cell
			
			String data = cell.getStringCellValue();//to read the data from the cell
			
			System.out.println(data);

		}
	}

}
