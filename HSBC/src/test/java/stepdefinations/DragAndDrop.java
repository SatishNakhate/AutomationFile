package stepdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
			WebElement frame= driver.findElement(By.cssSelector("iframe.demo-frame"));
			System.out.println(frame.getText());
			//driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		Thread.sleep(5000);
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/h5"));
		WebElement drop = driver.findElement(By.id("trash"));
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
