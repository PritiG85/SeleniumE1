package ReadPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchingtheDataFromPrperties {

	public static void main(String[] args) throws IOException {
		// to create the object of fileinputeStreme class
		 FileInputStream fis = new FileInputStream("./data/commomData.properties");

		// To create the object of properties class
		Properties prop = new Properties();

		// to fetch the load method from properties class
		prop.load(fis);

		// to get the data from properties file
		String data = prop.getProperty("url");
		System.out.println(data);

	}

}
