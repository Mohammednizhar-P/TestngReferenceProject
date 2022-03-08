package utils;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readxl {

	public static void main(String[] args) throws IOException {


		String FileLocation ="./folderlog/logindata.xlsx";   // file location

		XSSFWorkbook wbook = new XSSFWorkbook(FileLocation); // locate the work book amd access workbook

		XSSFSheet sheet = wbook.getSheetAt(0);

		int lastRowNum = sheet.getLastRowNum();// it calculates excpected header
		System.out.println("exclusive of header:"+lastRowNum  );

		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("inclusiv of header:"+physicalNumberOfRows);// it calculate all rows including header


		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("numof cells :"+lastCellNum  );


		for (int i = 1; i <= lastRowNum; i++) { 
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j <  lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter dft = new DataFormatter();
				String formatCellValue = dft.formatCellValue(cell);
				System.out.println(formatCellValue);


			} 
		}


		wbook.close();  // resourse close
























	}
































}
