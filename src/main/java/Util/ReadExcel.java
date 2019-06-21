package Util;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.DataProvider;


	public class ReadExcel {
		@DataProvider(name = "fetchData")
		public String[][] readData(String fileName) throws IOException {

		//public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			
			FileInputStream fis = new FileInputStream("./Data/" + fileName);
				HSSFWorkbook wbook = new HSSFWorkbook(fis);
				HSSFSheet sheet = wbook.getSheet("Sheet1");
							
			////////////////////////////////////////////////////////////////////////////////
				int lastRowNum1 = sheet.getLastRowNum();
				int lastCellNum1 = sheet.getRow(0).getLastCellNum();
				//array is inizialed for data
				String[][] data = new String[lastRowNum1][lastCellNum1];
				System.out.println("the last row no " + lastRowNum1);
				System.out.println("the last column no " + lastCellNum1);
				for (int i = 1; i <=lastRowNum1; i++)
				{
					HSSFRow row=sheet.getRow(i);
					for(int j=0;j<lastCellNum1;j++)
					{
					String stringCellValue1 = row.getCell(j).getStringCellValue();
					//printing the cell data
					System.out.println(i + "-" + j + "-" + stringCellValue1);
					//storing the data in two dimensional array
					data[i-1][j]=stringCellValue1;		
					}
				}
				
			return data;
		}
	}


