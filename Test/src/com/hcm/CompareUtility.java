package com.hcm;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;

public class CompareUtility { 
	public static void main(String[] args) {
			
		
		try {
				Properties prop = new Properties();
				
				
				
				//InputStream ip = new FileInputStream("D:\\columnMapping1.properties");
				//prop.load(ip);
				
				//System.out.println("Prop val "+prop.getProperty("GUID_SESA"));
				
				//Read Excel File
				InputStream ExcelFileToRead = new FileInputStream("D:/HCM_insert1407_2308.xls");
				HSSFWorkbook wb = new HSSFWorkbook(ExcelFileToRead);
		
				HSSFSheet sheet=wb.getSheetAt(0);
				HSSFRow row;
				HSSFCell cell;
				Iterator rows = sheet.rowIterator();
				
				ArrayList headerList = new ArrayList<String>();
				int rowCnt = 0;
				while (rows.hasNext())
				{
					row=(HSSFRow) rows.next();
					Iterator cells = row.cellIterator();
					int cellCnt = 0;
					
					if(rowCnt==0)
					{//Read header row
						while(cells.hasNext())
						{
							String cellValue = "";
							cell=(HSSFCell) cells.next();
							cellValue = getCellValue(cell);
							headerList.add(cellValue);
							System.out.println(cellValue);
							cellCnt++;
						}
					}
					else
					{//Read rest of the rows
						while(cells.hasNext())
						{
							cell=(HSSFCell) cells.next();
							String cellValue = "";
							String headerValue = "";
							if(cellCnt==0)
							{
								//Fetch DB record
								
								
								
							}
							else
							{
								
								
							}
							cellCnt++;
						}
					}
					
					
					
					
					rowCnt++;
					
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static String getCellValue(HSSFCell cell)
	{
		String cellValue="";
		if (cell.getCellType() == HSSFCell.CELL_TYPE_STRING)
		{
			cellValue = cell.getStringCellValue();
		}
		else if(cell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC)
		{
			cellValue = String.valueOf(cell.getNumericCellValue());
			if (DateUtil.isCellDateFormatted(cell)) {
				cellValue = String.valueOf(cell.getDateCellValue());
	        } else {
	        	cellValue = String.valueOf(cell.getNumericCellValue());
	        }
		}
		else if (cell.getCellType() == HSSFCell.CELL_TYPE_BOOLEAN)
		{
			cellValue = String.valueOf(cell.getBooleanCellValue());
		}
		else if (cell.getCellType() == HSSFCell.CELL_TYPE_BOOLEAN)
		{
			cellValue = String.valueOf(cell.getCellFormula());
		}
		
	
		return cellValue;
		
		
	}
}
