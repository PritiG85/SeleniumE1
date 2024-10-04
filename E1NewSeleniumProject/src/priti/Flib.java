package priti;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	//to take the value from properties file
	public  String readPropertyData(String propPath,String key) throws IOException {
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop=new Properties();
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;	
	}

	public String readExelData(String EXEL_PATH,String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream( EXEL_PATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Menu");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		return data;
	}
	
	
}
