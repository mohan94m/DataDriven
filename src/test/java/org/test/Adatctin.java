package org.test;

import java.io.IOException;
import org.utility.BaseClass;

public class Adatctin {

	public static void main(String[] args) throws IOException, InterruptedException {
		   String fileLocation = "D:\\Mohan\\Framework\\DataDrivenFramework\\Excel\\AdactinOrderBooking.xlsx";
		    BaseClass base =new BaseClass();  //Object creation for BaseClass
		    
		    //Launching Chrome Browser
		    BaseClass.openBrowser("chrome");
		    BaseClass.navigateToUrl("https://adactinhotelapp.com/");
		    
		    //LoginPage
		    base.sendText(base.findElementById("username"), base.getDataFromExcel(fileLocation, "LoginPage", 1,0));
		    base.sendText(base.findElementById("password"), base.getDataFromExcel(fileLocation, "LoginPage", 1,1));
		    base.clickButton(base.findElementById("login"));
		    
		    //Search Hotel page
		    base.selectDDByVisibleText(base.findElementById("location"), base.getDataFromExcel(fileLocation, "SearchHotelPage", 1, 0));
		    base.selectDDByVisibleText(base.findElementById("hotels"), base.getDataFromExcel(fileLocation, "SearchHotelPage",2, 1));
		    base.selectDDByVisibleText(base.findElementById("room_type"), base.getDataFromExcel(fileLocation,"SearchHotelPage" , 2, 2));
		    base.selectDDByVisibleText(base.findElementById("room_nos"), base.getDataFromExcel(fileLocation, "SearchHotelPage", 2, 3));
		    base.sendText(base.findElementById("datepick_in"), base.getDataFromExcel(fileLocation, "SearchHotelPage", 2, 4));
		    base.sendText(base.findElementById("datepick_out"), base.getDataFromExcel(fileLocation, "SearchHotelPage", 2, 5));
		    base.selectDDByVisibleText(base.findElementById("adult_room"), base.getDataFromExcel(fileLocation, "SearchHotelPage", 2, 6));
		    base.selectDDByVisibleText(base.findElementById("child_room"), base.getDataFromExcel(fileLocation, "SearchHotelPage", 2, 7));
		    base.clickButton(base.findElementById("Submit"));
		    
		    
		    //Select Hotel Page
		    base.clickButton(base.findElementById("radiobutton_0"));
		    base.clickButton(base.findElementById("continue"));
		    
		    //BookAHotel page
		    base.sendText(base.findElementById("first_name"), base.getDataFromExcel(fileLocation, "BookAHotelPage", 1, 0));
		    base.sendText(base.findElementById("last_name"), base.getDataFromExcel(fileLocation, "BookAHotelPage", 1, 1));
		    base.sendText(base.findElementById("address"), base.getDataFromExcel(fileLocation, "BookAHotelPage", 1, 2));
		    base.sendText(base.findElementById("cc_num"), base.getDataFromExcel(fileLocation, "BookAHotelPage", 1, 3));
		    base.selectDDByVisibleText(base.findElementById("cc_type"), base.getDataFromExcel(fileLocation, "BookAHotelPage", 1, 4) );
		    base.selectDDByVisibleText(base.findElementById("cc_exp_month"), base.getDataFromExcel(fileLocation, "BookAHotelPage", 1, 5));
		    base.selectDDByVisibleText(base.findElementById("cc_exp_year"), base.getDataFromExcel(fileLocation, "BookAHotelPage", 1, 6));
		    base.sendText(base.findElementById("cc_cvv"), base.getDataFromExcel(fileLocation, "BookAHotelPage", 1, 7));
		    base.clickButton(base.findElementById("book_now"));
				    
		    //Write Order No into Excel
		    Thread.sleep(7000);
		    String orderNo = base.getAttribute(base.findElementById("order_no"));
		    System.out.println("Order No: "+ orderNo);
		    base.writeDataInCell(fileLocation, "BookingConfirmation", 3, 0, orderNo);	  
		    
		    //Closing  Browser
		    BaseClass.quitAllBrowserWindow();

	}

}
