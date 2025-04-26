package org.reusable;

import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ExcelReadData {

	
	public String readexcel(String ip) throws IOException
	{
		FileInputStream f = new FileInputStream(".//data//Rankcard.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sh = wb.getSheetAt(0);
		int rowcount = sh.getLastRowNum();
		int colcount = sh.getRow(0).getLastCellNum();
		String op=null;
		
		for(int i=0;i<rowcount;i++)
		{
			try
			{
			XSSFRow row = sh.getRow(i);
			for(int j=0;j<colcount;j++)
			{
			System.out.println(row.getCell(j).getStringCellValue());
			String dadd = row.getCell(j).getStringCellValue();
			if(dadd.equals(ip))
			{
				 op=row.getCell(++j).getStringCellValue();
			}
			}
			}
			catch(NullPointerException e)
			{
				
			}
		}
			return op;
			
	}
	
	
	
	
	public String excelread(String ip) throws IOException
	{


		FileInputStream f = new FileInputStream(".//data//Rankcard.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		//XSSFSheet sh = wb.getSheet("Automation");
		XSSFSheet sh = wb.getSheetAt(0);
		String op=null;
		int rowcount = sh.getLastRowNum();//6
		int colcount = sh.getRow(0).getLastCellNum();//2
		int r=rowcount-1;
		
		String da = sh.getRow(3).getCell(0).getStringCellValue();
		System.out.println(da);
		
		
		for(int i=0;i<r;i++)
		{
			try
			{
			XSSFRow row = sh.getRow(i);
			for(int j=0;j<colcount;j++)
			{
			System.out.println(row.getCell(j).getStringCellValue());
			String dadd = row.getCell(j).getStringCellValue();
			if(dadd.equals("002"))
			{
				op=row.getCell(++j).getStringCellValue();//yuvaraj
				
			}
			}
			}
			catch(NullPointerException e)
			{
				
			}
		}
		
		System.out.println(sh.getRow(3).getCell(0).getStringCellValue());
		//System.out.println(sh.getRow(2).getCell(1).getNumericCellValue());
		System.out.println(sh.getRow(3).getCell(1).getStringCellValue());

		XSSFRow row = sh.getRow(2);
		
		XSSFCell cell = row.getCell(1);
		XSSFCell cell2 = row.getCell(0);
		
		String op1 = cell2.getStringCellValue();
		String op2 = cell.getStringCellValue();
		
		System.out.println(op1+" : "+op2);
		
		return op;
	
	}
	public static void main(String[] args) throws IOException {}

}
