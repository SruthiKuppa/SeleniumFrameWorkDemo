package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class SignUpTest extends BaseTest{

	
	@Test
	public void signUp(String username,String password) throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign up")).click();
		System.out.println("Sign up Link clicked successful");
		Thread.sleep(2000);
		System.out.println("Sign up button clicked");
		System.out.println("opened page:"+driver.getTitle());
		
		//now enter username, password
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(200);
		driver.findElement(By.id("signup-newsletter")).click();
		driver.findElement(By.id("signup-termservice")).click();
		Thread.sleep(1000);
		System.out.println("Now clicked on Sign up for Free button");
		driver.findElement(By.id(pl.getProperty("signupButton"))).click();

		
	}
}
