package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectclass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		WebElement drop = driver.findElement(By.id("course"));
		Select select = new Select(drop);
		//select.selectByVisibleText("Dot Net");
		Thread.sleep(6000);
		select.selectByIndex(3);
		String selecttext = select.getFirstSelectedOption().getText();
		System.out.println("Txtis : " + selecttext);
		//Thread.sleep(7000);
		//select.selectByValue("java");
		
		
	}

}
