



	package stepdefinations;

	import java.io.File;
import java.io.IOException;
import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class testbnfgg {

		@BeforeMethod
		public void start()
		{
			
			System.out.println(" use the link");
		}
		
		@Test(priority = 1, invocationCount = 2)
		public void login()
		{
			WebDriverManager.chromedriver();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			System.out.println("I am in the login page");
		}
		@Test(priority =2)
		public void printer() throws IOException 
		{
			WebDriverManager.chromedriver();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			System.out.println("I am in the printer page");
			
			File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(f,new File("C:\\Users\\sanakhat\\Downloads\\OfficeAppFile\\screenshot.png"));
		
		}
		@Test(priority =3)
		public void printo()
		{
			WebDriverManager.chromedriver();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			System.out.println("Printed the ticket");
		
		}
		@AfterMethod
		public void print()
		{
			
			System.out.println(" Take SS");
		}
	}


