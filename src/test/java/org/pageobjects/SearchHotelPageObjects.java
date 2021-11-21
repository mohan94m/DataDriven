package org.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class SearchHotelPageObjects extends BaseClass {
	
	public SearchHotelPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement ddLocation;
	@FindBy(id="hotels")
	private WebElement ddHotel;
	@FindBy(id="room_type")
	private WebElement ddRoomType;
	@FindBy(id="room_nos")
	private WebElement ddNoOfRooms;
	@FindBy(id="datepick_in")
	private WebElement txtCheckInDate;
	@FindBy(id="datepick_out")
	private WebElement txtCheckOutDate;
	@FindBy(id="adult_room")
	private WebElement ddNoOfAdults;
	@FindBy(id="child_room")
	private WebElement ddNoOfChildren;
	@FindBy(id="Submit")
	private WebElement btnSearch;
	
	public WebElement getDdLocation() {
		return ddLocation;
	}
	public WebElement getDdHotel() {
		return ddHotel;
	}
	public WebElement getDdRoomType() {
		return ddRoomType;
	}
	public WebElement getDdNoOfRooms() {
		return ddNoOfRooms;
	}
	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}
	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}
	public WebElement getDdNoOfAdults() {
		return ddNoOfAdults;
	}
	public WebElement getDdNoOfChildren() {
		return ddNoOfChildren;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	public WebElement getBtnReset() {
		return btnReset;
	}

	@FindBy(id="Submit")
	private WebElement btnReset;
	

}
