package stepdefinations;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindoWHandles {

	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//		driver.manage().window().maximize();
//		String parentWin = driver.getWindowHandle();
//		//Here will get the single window and unique
//		
//		try {
//			driver.findElement(By.id("newWindowBtn")).click();
//			
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Set<String> windows = driver.getWindowHandles();
//		for(String wins : windows) {
//			if(!wins.equals(parentWin)) {
//				driver.switchTo().window(wins);
//				WebElement newwin =driver.findElement(By.id("firstName"));
//				Thread.sleep(5000);
//				newwin.click();
//				Thread.sleep(5000);
//				//driver.close();
//				break;
//			}
//		}
//		driver.switchTo().window(parentWin);
//		//driver.switchTo().defaultContent();
//		driver.findElement(By.id("name")).sendKeys("Satish back Again");
//		 // System.out.println("ssss: " + driver.getPageSource());
//		
//		  System.out.println("Title: " + driver.getTitle());
//		  System.out.println("url: " + driver.getCurrentUrl());
//		driver.quit();
	}

}

class windhandlesss{
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		String parentwin = driver.getWindowHandle();
		//WebElement link = driver.findElement(By.id("newWindowsBtn"));
		//add the Explicit wait
		//Create a webDriver Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10) );
		//Wait the until the elemenet is clickable
		WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.id("newWindowsBtn")));
		link.click();
		Set<String> windows = driver.getWindowHandles();
		//Set is return type of getWindowHandle or s
		 
		List<String> winlists = new ArrayList<String>(windows);
		try {
		if(winlists.size() >=3) {
			driver.switchTo().window(winlists.get(4));
			System.out.println(" Switched to 3 window " + driver.getTitle());
			driver.close();
		}
		}catch(Exception e) {
				
				System.out.println( e +" Less than 3 window ");
			
		}
		   driver.quit();
		
	}
}
