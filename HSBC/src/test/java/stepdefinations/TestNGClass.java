package stepdefinations;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class TestNGClass {

	static WebDriver driver;
	
	@Test(priority = 1, invocationCount =5)
	public void login()
	{
		System.setProperty("WebDriver.chrome.driver", "Path");
		WebDriverManager.chromedriver();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		 try {
			 	driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	            WebElement closeModal = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Consider")));
	            closeModal.click();
	        } catch (Exception e) {
	            System.out.println("Modal not present, skipping.");
	        }
		 
		 try {
			 driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	            WebElement closeModal = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Consider")));
	            closeModal.click();
	        } catch (Exception e) {
	            System.out.println("Modal not present, skipping.");
	        }
		driver.findElement(By.id("ohrmList_chkSelectAll")).click();
		

	}
	@Test(priority =5)
	public void printer() throws InterruptedException
	{
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://sel");
		driver.manage().window().maximize();
		 try {
			 	driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	            WebElement closeModal = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Consider")));
	            closeModal.click();
	        } catch (Exception e) {
	            System.out.println("Modal not present, skipping.");
	        }
		 
		 try {
			 driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	            WebElement closeModal = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Consider")));
	            closeModal.click();
	        } catch (Exception e) {
	            System.out.println("Modal not present, skipping.");
	            //File fis = ((TakesScreenshot)driver)getScreenshotAs(OutputType.FILE);
	        }
		driver.findElement(By.id("ohrmList_chkSelectAll")).click();
		
//		driver.findElement(By.xpath("//input[@id= \"fromCity\"]")).sendKeys("Kolkata");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class=\"makeFlex column flexOne\"]//*[text()='Kolkata']")).click();
//		System.out.println("Selection Done");
//		driver.close();
	}
	@Test(priority =3)
	public void printo()
	{
		System.out.println("Printed the ticket");
		//driver.findElement(By.xpath("//input[@id= \"fromCity\"]")).sendKeys("Kolkata");
		//Thread.sleep(2000);
		//driver.findElement(By.x
	}
	@AfterMethod
	public void print()
	{
		
		System.out.println(" Flight tocket booked");
	}
	
	public void takesSS() {
		File fis = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(fis, new File("C:\\Users\\sanakhat\\Downloads\\OfficeAppFile"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("Window.scroll(0,500)");
	}
}
