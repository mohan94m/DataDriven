package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeExcel {
	public static void main(String[] args) throws IOException {
		File location = new File("D:\\Mohan\\Framework\\DataDrivenFramework\\Excel\\TestData.xlsx");
		FileInputStream excel = new FileInputStream(location);
		Workbook testData = new XSSFWorkbook(excel);
		Sheet sheet = testData.getSheet("Mohan");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				if (cellType==1) {
					String value = cell.getStringCellValue();
				}else if (cellType==0) {
					boolean isdateFormatted = DateUtil.isCellDateFormatted(cell);
				}
				
			}
			
		}
		
		
		
		
	}

}
