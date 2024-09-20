package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	//Declare the global variables
	public static WebDriver driver;
	public static Properties p= new Properties();
	public static FileReader f;
	//declare properties and FileReader for Locators file
	public static Properties pl= new Properties();
	public static FileReader fl;
	
	@BeforeTest
	public void setUp() throws IOException {
		
		if(driver==null) {
			System.out.println("The Path is:"+System.getProperty("user.dir"));
			//load config file to reader
			FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configFiles\\config.properties");
			p.load(fr);
			//load locator file to reader
			FileReader fl = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configFiles\\locator.properties");
			pl.load(fl);
		}
		
		if(p.getProperty("browser").equalsIgnoreCase("chrome")) {
			 driver= new ChromeDriver();
			 driver.get(p.getProperty("testurl"));
		}
		else if(p.getProperty("browser").equalsIgnoreCase("firefox")) {
			 driver= new FirefoxDriver();
			 driver.get(p.getProperty("testurl"));
		}
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Tear Down successful");
	}
}
