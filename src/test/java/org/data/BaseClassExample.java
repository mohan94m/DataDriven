package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.utility.BaseClass;

public class BaseClassExample {

	public static void main(String[] args) {
		BaseClass base =new BaseClass();
		
       WebDriver driver = base.openBrowser("chrome");
       base.navigateToUrl("https://www.amazon.in/");
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
       base.quitAllBrowserWindow();
      }


}
