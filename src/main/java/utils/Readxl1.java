package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readxl1 {


	public static void main(String[] args) throws InvalidFormatException, IOException {


		File f = new File("./logindata/log.xlsx");

		FileInputStream fis = new FileInputStream(f);

		XSSFWorkbook wb = new XSSFWorkbook( fis);  // work book 

		XSSFSheet sheetAt = wb.getSheetAt(0);  // get work book specified sheet

		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();



		for (int i = 0; i < physicalNumberOfRows ; i++) {

			XSSFRow row = sheetAt.getRow(i);

			int physicalNumberOfCells = row.getPhysicalNumberOfCells();


			for (int j = 0; j < physicalNumberOfCells ; j++) {

				XSSFCell cell = row.getCell(j);

				CellType cellType = cell.getCellType();


				if (cellType.equals(cellType.STRING) ) {

					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);

				}else if ( cellType.equals(cellType.NUMERIC)) {

					double numericCellValue = cell.getNumericCellValue();

					int value = (int)numericCellValue;

					String valueOf = String.valueOf(value);
					System.out.println(valueOf);
				}
			}


			XSSFCell createCell = wb.getSheetAt(0).createRow(4).createCell(0);
			createCell.setCellValue("data");
			 
		 
		 
			FileOutputStream set = new FileOutputStream(f);
			wb.write(set);
			 





			wb.close();

		}

	}


}




















































