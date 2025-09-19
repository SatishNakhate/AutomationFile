import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practicesss2 {

	static WebDriver driver;
	@AfterMethod
	public void closs() {
		//driver.quit();
	}
	@BeforeMethod
	public void chrmm(){
		driver = new ChromeDriver();
		//driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		//driver.navigate().refresh();
	}
		@Test(invocationCount = 1, enabled = false)
		public void alertt() {
			WebElement ele =driver.findElement(By.xpath("//button[@class ='btn btn-danger']"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Alert alt = driver.switchTo().alert();
			alt.accept();
			
			//assertTrue(false, "This is false");
			System.out.println((ele.isDisplayed()));
			System.out.println((ele.getText()));
		}
		@Test(enabled = false)
		public void dynamicdop() throws InterruptedException {
			Actions action = new Actions(driver);
			WebElement dyna= driver.findElement(By.xpath("(//a[contains(text(), 'Tester’s Hub')])[1]"));
			
			action.moveToElement(dyna).perform();
			List<WebElement> list = driver.findElements(By.xpath("//*[@id= 'menu']/ul/li[4]/div/ul/li"));
			for(WebElement word : list) {
				if(word.getText().equals("Sample Page Test")) {
					Thread.sleep(5000);
					word.click();
					Thread.sleep(5000);
				}
			}
			
		}
		
		@Test(enabled = false)
		public void selett() {
			WebElement eles =driver.findElement(By.id("demo_groups"));
			Select select = new Select(eles);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0, 500)");
			select.selectByVisibleText("Two");
		
		
		}
		@Test
		public void windoww() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.srollBy(0,1000");
			
			driver.findElement(By.tagName("Body")).sendKeys(Keys.PAGE_DOWN);
			driver.findElement(By.id("newTabBtn")).click();
			Thread.sleep(2500);
			Set <String> set = driver.getWindowHandles();
			List<String> list = new ArrayList<String>(set);
			
				if(list.size()>=2) {
					driver.switchTo().window(list.get(1));
					System.out.println(driver.getCurrentUrl());
					System.out.println(driver.getTitle());
					driver.close();
				}
			
			
			
		}

	}


