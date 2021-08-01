package configreader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigPropReader {

	Properties prop;
	FileInputStream ip;
	
	public Properties initProp() {
		
		prop = new Properties();
		try {
			ip = new FileInputStream("./src/main/resources/config/config.properties");
			prop.load(ip);			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}
