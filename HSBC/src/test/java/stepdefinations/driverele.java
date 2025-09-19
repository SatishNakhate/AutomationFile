package stepdefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverele {
	
	 WebDriver driver;
	@BeforeClass //This will runs in once before the first test method
	public void webdrv() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://www.hyrtutorials.com/p/broken-link1.html");
	driver.manage().window().maximize();
	}
	@Test(priority =2)
	public void link()
	{
		List <WebElement> list =driver.findElements(By.tagName("a"));
		for(WebElement d: list) {
			System.out.println("Text is : "  + d.getText() );
			String str = d.getAttribute("href");
			System.out.println("Attribute is : "  + d );
		}
	} 
	
	@Test(priority =1)
	public void linked()
	{
		
	}
}
