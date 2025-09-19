package practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dsdds {

	public static void main(String args[]) throws IOException {
//	WebDriverManager.chromedriver().setup();
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://www.ablebits.com/office-addins-blog/create-dynamic-dependent-drop-down-excel/");
//	driver.manage().window().maximize();
//	
	  String filepath = "C:\\Users\\sanakhat\\Downloads\\OfficeAppFile\\PetsStore.xlsx";
	  XSSFWorkbook workbook = new XSSFWorkbook();
	  Sheet sheet = workbook.createSheet("data");
	  Row headerRow = sheet.createRow(0);
	  headerRow.createCell(0).setCellValue("Name");
	  headerRow.createCell(1).setCellValue("Age");
	  
	  Row row1 = sheet.createRow(1);
	  row1.createCell(0).setCellValue("Satish");
	  row1.createCell(1).setCellValue("27");
	  
	  FileOutputStream fos = new FileOutputStream(filepath);
	  workbook.write(fos);
	  fos.close();
	  workbook.close();
	  System.out.println("Pass data");
	
	}			
}
