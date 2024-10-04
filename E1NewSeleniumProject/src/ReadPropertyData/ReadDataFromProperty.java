package ReadPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/config.property");
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty("username");
		System.out.println(data);
	}
	
}
