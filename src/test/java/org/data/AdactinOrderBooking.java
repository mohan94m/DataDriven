package org.data;

import java.io.IOException;

import org.pageobjects.BookAHotelPageObjects;
import org.pageobjects.BookingConfirmationPageObjects;
import org.pageobjects.LoginPageObjects;
import org.pageobjects.SearchHotelPageObjects;
import org.pageobjects.SelectHotelPageObjects;
import org.utility.BaseClass;


public class AdactinOrderBooking {
	
	public static void main(String[] args) throws IOException {
     String fileLocation = "D:\\Mohan\\Framework\\DataDrivenFramework\\Excel\\AdactinOrderBooking.xlsx";
    BaseClass base =new BaseClass();  //Object creation for BaseClass
    
    //Launching Chrome Browser
    base.openBrowser("chrome");
    base.navigateToUrl("https://adactinhotelapp.com/");
    
    //Loginpage object creation
    LoginPageObjects loginPage= new LoginPageObjects();
    loginPage.getTxtUserName();
    
    //LoginPage
    base.sendText(loginPage.getTxtUserName(), base.getDataFromExcel(fileLocation, "LoginPage", 1,0));
    base.sendText(loginPage.getTxtPassword(), base.getDataFromExcel(fileLocation, "LoginPage", 1,1));
    base.clickButton(loginPage.getBtnLogin());
    
    //SearchHotelPage object creation
    SearchHotelPageObjects SearchHotelPage= new SearchHotelPageObjects();
    
    //Search Hotel page
    base.selectDDByVisibleText(SearchHotelPage.getDdLocation(), base.getDataFromExcel(fileLocation, "SearchHotelPage", 1, 0));
    base.selectDDByVisibleText(SearchHotelPage.getDdHotel(), base.getDataFromExcel(fileLocation, "SearchHotelPage",2, 1));
    base.selectDDByVisibleText(SearchHotelPage.getDdRoomType(), base.getDataFromExcel(fileLocation,"SearchHotelPage" , 2, 2));
    base.selectDDByVisibleText(SearchHotelPage.getDdNoOfRooms(), base.getDataFromExcel(fileLocation, "SearchHotelPage", 2, 3));
    base.sendText(SearchHotelPage.getTxtCheckInDate(), base.getDataFromExcel(fileLocation, "SearchHotelPage", 2, 4));
    base.sendText(SearchHotelPage.getTxtCheckOutDate(), base.getDataFromExcel(fileLocation, "SearchHotelPage", 2, 5));
    base.selectDDByVisibleText(SearchHotelPage.getDdNoOfAdults(), base.getDataFromExcel(fileLocation, "SearchHotelPage", 2, 6));
    base.selectDDByVisibleText(SearchHotelPage.getDdNoOfChildren(), base.getDataFromExcel(fileLocation, "SearchHotelPage", 2, 7));
    base.clickButton(SearchHotelPage.getBtnSearch());
    
    //SelectHotelPage object creation
    SelectHotelPageObjects selectHotelPage = new SelectHotelPageObjects();
    
    //Select Hotel Page
    base.clickButton(selectHotelPage.getBtnRadio());
    base.clickButton(selectHotelPage.getBtnContinue());
    
    //BookAHotel page object creation
    BookAHotelPageObjects bookAHotel = new BookAHotelPageObjects();
    
    //BookAHotel page
    base.sendText(bookAHotel.getTxtFirstName(), base.getDataFromExcel(fileLocation, "BookAHotelPage", 1, 0));
    base.sendText(bookAHotel.getTxtLastName(), base.getDataFromExcel(fileLocation, "BookAHotelPage", 1, 1));
    base.sendText(bookAHotel.getTxtBillingAddress(), base.getDataFromExcel(fileLocation, "BookAHotelPage", 1, 2));
    base.sendText(bookAHotel.getTxtCreditCardNumber(), base.getDataFromExcel(fileLocation, "BookAHotelPage", 1, 3));
    base.selectDDByVisibleText(bookAHotel.getDdCreditCardType(), base.getDataFromExcel(fileLocation, "BookAHotelPage", 1, 4) );
    base.selectDDByVisibleText(bookAHotel.getDdExpMonth(), base.getDataFromExcel(fileLocation, "BookAHotelPage", 1, 5));
    base.selectDDByVisibleText(bookAHotel.getDdExpYear(), base.getDataFromExcel(fileLocation, "BookAHotelPage", 1, 6));
    base.sendText(bookAHotel.getTxtCvvNumber(), base.getDataFromExcel(fileLocation, "BookAHotelPage", 1, 7));
    base.clickButton(bookAHotel.getBtnBookNow());
    
    //BookingConfirmation object creation
    BookingConfirmationPageObjects bookingConfirmation = new BookingConfirmationPageObjects();
    
    //Printing Order No
    String orderNo = base.getAttribute(bookingConfirmation.getTxtOrderNo());
    System.out.println("Order No: "+orderNo);
    //Closing  Browser
    base.quitAllBrowserWindow();
	}

}
