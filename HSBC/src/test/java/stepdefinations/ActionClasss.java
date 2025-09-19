package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClasss {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		WebElement selenium = driver.findElement(By.xpath("//ul[@id='nav1']/child::li[4]/a"));
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		action.moveToElement(selenium).perform();
		//a[contains(text(), 'Selenium Practice')]
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.xpath("//ul[@id='nav1']/child::li[4]/ul/li[3]"));
		Thread.sleep(1000);
		link.click();
		System.out.println("Text and Link is  : " + link.getText()  + "  Size is "+ link.getSize());
		action.moveToElement(link).perform();
		driver.navigate().back();
		

	}

}
