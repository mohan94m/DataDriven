package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DataDrivenExcelReading {

	public static void main(String[] args) throws IOException {
     System.out.println("DATA READING FROM EXCEL");
     File location = new File("D:\\Mohan\\Framework\\DataDrivenFramework\\Excel\\TestData.xlsx");
     FileInputStream file = new FileInputStream(location);
     Workbook workbook = new XSSFWorkbook(file);
     Sheet sheet = workbook.getSheetAt(0);
     int numberOfRows = sheet.getPhysicalNumberOfRows();
  
     for (int i = 0; i <numberOfRows ; i++) {
    	 Row row =sheet.getRow(i);
    	 for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
    		 Cell cell =row.getCell(j);
    		 int type = cell.getCellType();
    		 if (type==1) {
    			 String value = cell.getStringCellValue();
    			 System.out.print(value+"\n");
				
			} else if (type==0) {
				boolean isdate = DateUtil.isCellDateFormatted(cell);
				if (isdate) {
					Date date = cell.getDateCellValue();
					SimpleDateFormat simple = new SimpleDateFormat("dd-MM-yyyy");
					String value = simple.format(date);
					System.out.print(value+"\n");
				} else {
					double d = cell.getNumericCellValue();
					long l = (long) d;
					String value = String.valueOf(l);
					System.out.print(value+"\n");
				}
			}	
		}
    	
    	 System.out.println();
	} 
	}

}
