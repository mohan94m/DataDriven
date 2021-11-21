package org.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class BookingConfirmationPageObjects extends BaseClass {
	public BookingConfirmationPageObjects() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement txtOrderNo;
	public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}
	
	

}
