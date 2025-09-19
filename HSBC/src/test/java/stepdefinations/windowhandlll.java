package stepdefinations;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandlll {
	
	@SuppressWarnings("deprecation")
	@Test
	public void handle() throws InterruptedException {
		
	WebDriverManager.chromedriver();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	driver.manage().window().maximize();
	driver.findElement(By.id("newWindowBtn")).click();
	String parentwindow = driver.getWindowHandle();
	System.out.println(parentwindow);
	Set<String> handles = driver.getWindowHandles();
	for(String childewindow : handles) {
		System.out.println(childewindow);
		if(!childewindow.equals(parentwindow)) {
			driver.switchTo().window(childewindow);
			Thread.sleep(5000);
			driver.manage().window().maximize();
			driver.findElement(By.id("firstName")).sendKeys("Satish");
			Thread.sleep(5000);
			driver.close();
			
		}
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("AgainSatish");
		
	}
	
	
	
	}
	
}
