package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtils 
{
	public static void main(String[] args) throws Exception
	{
		getRowCount();
		getCellData();
	}
	public static void getCellData() throws IOException
	{
		
		String excelPath=".\\data\\TestData.xlsx";
		XSSFWorkbook workbook=new XSSFWorkbook(excelPath);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		
		String value=sheet.getRow(1).getCell(2).getStringCellValue();
		System.out.println(value);
	}
	public static void getRowCount()
	{
		try
		{
		String excelPath="./data/TestData.xlsx";
		XSSFWorkbook workbook=new XSSFWorkbook(excelPath);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rowCount=sheet.getPhysicalNumberOfRows();
		System.out.println("No of rows : "+rowCount);
		}catch (Exception exp)
		{
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
	}

}
