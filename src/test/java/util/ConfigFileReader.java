package util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileReader f=new FileReader("C:\\Users\\kruth\\Documents\\SK\\SeleniumFramework\\src\\test\\resources\\configFiles\\config.properties");
		
		Properties p = new Properties();
		p.load(f);
		
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("testurl"));
	}

}
