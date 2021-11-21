package org.data;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonToExcel {

	public static void main(String[] args) throws IOException {
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.amazon.in/");
	     WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
	     txtSearch.sendKeys("iphone",Keys.ENTER);
	     List<WebElement> iphones = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	     File location = new File("D:\\Mohan\\Framework\\DataDrivenFramework\\Excel\\iPhoneList.xlsx");
	     Workbook workbook = new XSSFWorkbook();
	     Sheet sheet = workbook.createSheet("iPhone");
	     
	     for (int i = 0; i < iphones.size(); i++) {
	    	 Row row = sheet.createRow(i);
	    	 Cell cell = row.createCell(0);
	    	 WebElement iphone = iphones.get(i);
	    	 cell.setCellValue(iphone.getText());			
		}
	     
	    FileOutputStream output = new FileOutputStream(location);
	    workbook.write(output);
	    driver.quit();
	    
	     

	}

}
