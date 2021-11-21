package org.utility;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;
	public static Actions actions;
	public static Robot robot;
	public static JavascriptExecutor executor;
	public static Select select;

	public static WebDriver openBrowser(String browser) {
		if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		manageOptionsInDriver().window().maximize();
		return driver;
	}

	// WebDriver Interface Methods

	public static void quitAllBrowserWindow() {
		driver.quit();

	}

	public static void closeCurrentWindow() {
		driver.close();
	}

	public static void goToUrl(String url) {
		driver.get(url);
	}

	public static void navigateToUrl(String url) {
		driver.navigate().to(url);
	}

	public static WebElement findElementById(String locator) {
		WebElement element = driver.findElement(By.id(locator));
		return element;
	}

	public static WebElement findElementByName(String locator) {
		WebElement element = driver.findElement(By.name(locator));
		return element;
	}

	public static WebElement findElementByClassName(String locator) {
		WebElement element = driver.findElement(By.className(locator));
		return element;
	}

	public static WebElement findElementByXpath(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element;
	}

	public static WebElement findElementByCssSelector(String locator) {
		WebElement element = driver.findElement(By.cssSelector(locator));
		return element;
	}

	public static WebElement findElementByTagname(String locator) {
		WebElement element = driver.findElement(By.tagName(locator));
		return element;
	}

	public static WebElement findElementByLinkText(String locator) {
		WebElement element = driver.findElement(By.linkText(locator));
		return element;
	}

	public static WebElement findElementByPartialLinkText(String locator) {
		WebElement element = driver.findElement(By.partialLinkText(locator));
		return element;
	}

	public static List<WebElement> findElementsById(String locator) {
		List<WebElement> element = driver.findElements(By.id(locator));
		return element;
	}

	public static List<WebElement> findElementsByName(String locator) {
		List<WebElement> element = driver.findElements(By.name(locator));
		return element;
	}

	public static List<WebElement> findElementsByClassName(String locator) {
		List<WebElement> element = driver.findElements(By.className(locator));
		return element;
	}

	public static List<WebElement> findElementsByXpath(String locator) {
		List<WebElement> element = driver.findElements(By.xpath(locator));
		return element;
	}

	public static List<WebElement> findElementsByCssSelector(String locator) {
		List<WebElement> element = driver.findElements(By.cssSelector(locator));
		return element;
	}

	public static List<WebElement> findElementsByTagname(String locator) {
		List<WebElement> element = driver.findElements(By.tagName(locator));
		return element;
	}

	public static List<WebElement> findElementsByLinkText(String locator) {
		List<WebElement> element = driver.findElements(By.linkText(locator));
		return element;
	}

	public static List<WebElement> findElementsByPartialLinkText(String locator) {
		List<WebElement> element = driver.findElements(By.partialLinkText(locator));
		return element;
	}

	public static String getCurrentPageUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static String getCurrentPageTitle() {
		String currentTitle = driver.getTitle();
		return currentTitle;
	}

	public static TargetLocator switchToTarget() {
		TargetLocator switchTo = driver.switchTo();
		return switchTo;
	}

	public static Options manageOptionsInDriver() {
		Options manage = driver.manage();
		return manage;
	}

	public static String getCurrentWindowId() {
		String handle = driver.getWindowHandle();
		return handle;
	}

	public static List<String> getAllWindowId() {
		Set<String> handles = driver.getWindowHandles();
		List<String> windowHandles = new ArrayList<String>();
		windowHandles.addAll(handles);
		return windowHandles;
	}

	// WebElement Interface Methods
	public static void sendText(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void clickButton(WebElement element) {
		element.click();
	}

	public static WebElement findElementById(WebElement element, String locator) {
		WebElement elements = element.findElement(By.id(locator));
		return elements;
	}

	public static WebElement findElementByName(WebElement element, String locator) {
		WebElement elements = element.findElement(By.name(locator));
		return elements;
	}

	public static WebElement findElementByClassName(WebElement element, String locator) {
		WebElement elements = element.findElement(By.className(locator));
		return elements;
	}

	public static WebElement findElementByXpath(WebElement element, String locator) {
		WebElement elements = element.findElement(By.xpath(locator));
		return elements;
	}

	public static WebElement findElementByCssSelector(WebElement element, String locator) {
		WebElement elements = element.findElement(By.cssSelector(locator));
		return elements;
	}

	public static WebElement findElementByTagname(WebElement element, String locator) {
		WebElement elements = element.findElement(By.tagName(locator));
		return elements;
	}

	public static WebElement findElementByLinkText(WebElement element, String locator) {
		WebElement elements = element.findElement(By.linkText(locator));
		return elements;
	}

	public static WebElement findElementByPartialLinkText(WebElement element, String locator) {
		WebElement elements = element.findElement(By.partialLinkText(locator));
		return elements;
	}

	public static List<WebElement> findElementsById(WebElement element, String locator) {
		List<WebElement> elements = element.findElements(By.id(locator));
		return elements;
	}

	public static List<WebElement> findElementsByName(WebElement element, String locator) {
		List<WebElement> elements = element.findElements(By.name(locator));
		return elements;
	}

	public static List<WebElement> findElementsByClassName(WebElement element, String locator) {
		List<WebElement> elements = element.findElements(By.className(locator));
		return elements;
	}

	public static List<WebElement> findElementsByXpath(WebElement element, String locator) {
		List<WebElement> elements = element.findElements(By.xpath(locator));
		return elements;
	}

	public static List<WebElement> findElementsByCssSelector(WebElement element, String locator) {
		List<WebElement> elements = element.findElements(By.cssSelector(locator));
		return elements;
	}

	public static List<WebElement> findElementsByTagname(WebElement element, String locator) {
		List<WebElement> elements = element.findElements(By.tagName(locator));
		return elements;
	}

	public static List<WebElement> findElementsByLinkText(WebElement element, String locator) {
		List<WebElement> elements = element.findElements(By.linkText(locator));
		return elements;
	}

	public static List<WebElement> findElementsByPartialLinkText(WebElement element, String locator) {
		List<WebElement> elements = element.findElements(By.linkText(locator));
		return elements;
	}

	public static String getDataFromExcel(String fileLocation, String sheet, int rowIndex, int cellIndex)
			throws IOException {
		String value = null;
		File location = new File(fileLocation);
		FileInputStream input = new FileInputStream(location);
		Workbook workbook = new XSSFWorkbook(input);
		Sheet sheet2 = workbook.getSheet(sheet);
		Row row = sheet2.getRow(rowIndex);
		Cell cell = row.getCell(cellIndex);
		int type = cell.getCellType();
		if (type == 1) {
			value = cell.getStringCellValue();

		} else if (type == 0) {
			if (DateUtil.isCellDateFormatted(cell)) {

				SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
				value = s.format(cell.getDateCellValue());
			} else {
				value = String.valueOf((long) cell.getNumericCellValue());
			}
		}

		return value;
	}

	public static void selectDDByVisibleText(WebElement element, String text) {
		select = new Select(element);
		select.deselectByVisibleText(text);

	}

	public void writeData(String sheetName, int rowIndex, int cellIndex, String data) throws IOException {
		File loc = new File("D:\\Mohan\\Framework\\DataDrivenFramework\\Excel\\Hello.xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet(sheetName);
		Row row = sheet.createRow(rowIndex);
		Cell cell = row.createCell(cellIndex);
		cell.setCellValue(data);
		FileOutputStream stream = new FileOutputStream(loc);
		workbook.write(stream);
		

	}
	public void writeData(String sheetName, int rowIndex, int cellIndex, int data) throws IOException {
		File loc = new File("D:\\Mohan\\Framework\\DataDrivenFramework\\Excel\\Hello.xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet(sheetName);
		Row row = sheet.createRow(rowIndex);
		Cell cell = row.createCell(cellIndex);
		cell.setCellValue(data);
		FileOutputStream stream = new FileOutputStream(loc);
		workbook.write(stream);
		

	}

}
