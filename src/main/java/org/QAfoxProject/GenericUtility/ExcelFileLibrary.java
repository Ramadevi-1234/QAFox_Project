package org.QAfoxProject.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.classfile.TypeAnnotation.ThrowsTarget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**This Class Provides Reusable Methods To Perform CRUD in Excel File
 * @author Ramadevi
 * */

public class ExcelFileLibrary {
	
	FileInputStream fis;
	FileOutputStream fos;
	Workbook wb;
	DataFormatter df;

	/**
	 * 
	 * This Method Used To Fetch the Single Data From Excel File
	 * @param sheetName
	 * @param row
	 * @param column
	 * @return
	 * @throws IOException
	 * @throws EncryptedDocumentException
	 */
	public String StringreadSingleData(String sheet, int row, int column) {

		// Read the String Data From Excel and Return it
		return wb.getSheet("BasicData").getRow(1).getCell(1).getStringCellValue();

	}

	/**
	 * This Method Used To Fetch the Specific Column Data From Excel File
	 * @param sheetName
	 * @param column
	 */
	public ArrayList<Object> readSpecificColumnData(String sheet, int column) {

		
		// Fetch All Data From one Specific Column--- From Excel file
		int lastrow = wb.getSheet(sheet).getLastRowNum();
		ArrayList<Object> value = new ArrayList<Object>();
		for (int i = 1; i <= lastrow; i++) {
			String data = wb.getSheet(sheet).getRow(i).getCell(column).getStringCellValue();
			value.add(data);
		}
		return value;
	}

	/**
	 * 
	 * This Method Used To Fetch the read Specific Row Data From Excel File
	 * @param sheetName
	 * @param row
	 * @return
	 */
	public ArrayList<Object> readSpecificRowData(String sheet, int row) {

		
		// fetch The Last Cell Num in One Specific Row
		int lastcolumn = wb.getSheet(sheet).getRow(row).getLastCellNum();
		ArrayList<Object> value = new ArrayList<Object>();
		for (int i = 1; i < lastcolumn - 1; i++) {
			String data = wb.getSheet(sheet).getRow(row).getCell(i).getStringCellValue();
			value.add(data);
		}
		return value;

	}

	/**
	 * 
	 * This Method Used To Fetch the Display MultipleRecords From Excel File
	 * @param sheetName
	 * @param row
	 * @param column
	 * @return
	 */
	public void displayMultipleRecords(String sheet, int row, int column) {

		
		// fetch the All Data From multiple Record
		int lastrow = wb.getSheet(sheet).getLastRowNum();

		for (int i = 1; i <= lastrow; i++) {
			int lastcolumn = wb.getSheet(sheet).getRow(i).getLastCellNum();
			for (int j = 0; j < lastcolumn; j++) {
				String data = wb.getSheet(sheet).getRow(i).getCell(j).getStringCellValue();
				System.out.println(data + "\t");
			}
			System.out.println();

		}
	}

	/**
	 * 
	 * This Method Used To Fetch the MultipleRecords From Excel File,read data from excel and stores it in maps
	 * Key value pairs
	 * 
	 * @param sheetName
	 * @param expectedTestName
	 * @return
	 */
	public Map<String,String> readMultipleRecords(String sheet,String expectedTestName){
		Map<String,String> map = new HashMap<>();
		org.apache.poi.ss.usermodel.Sheet sh =  wb.getSheet(sheet);
		
		for(int i=0;i<=sh.getLastRowNum();i++) {
			if(df.formatCellValue(sh.getRow(i).getCell(1)).equals(expectedTestName)) {
				for(int j=1;j<=sh.getLastRowNum();j++) {
					String key = df.formatCellValue(sh.getRow(j).getCell(2));
					String value = df.formatCellValue(sh.getRow(j).getCell(3));
					
					map.put(key, value);
					if(key.equals("####"));
					break;
				}
				break;
			}
					
				}
		return map;
			}
	
	/**
	 * This Method initializes excel file
	 * @throws IOException 
	 * 
	 * 
	 */
	public void initExcel() throws IOException {
		// 1.convert the physical file into java understandable

		// 1.convert the physical file into java understandable

		
				try {
					fis = new FileInputStream(PathConstant.EXCEL_PATH);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}

				// 2.create an workbook using workbook factory

				try {
					wb = WorkbookFactory.create(fis);
				} catch (EncryptedDocumentException e) {
					e.printStackTrace();
				}
				//Initialize Data Formate
		df = new DataFormatter();
	}
	/**
	 * This Method is Used to close workbook
	 * 
	 */
	public void closeExcel() {
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * This method is Used to Write Single Data
	 * @param SheetName
	 * @param Row num
	 * @param Column Number
	 * @param TestData
	 * 
	 */
		
	public void writeSingleData_NewRow(String sheet,int row,int column,String data)
	{
	//Create New Row and Create Data
	wb.getSheet(sheet).createRow(row).createCell(column).setCellValue(data);
	//Write the data
	try {
		wb.write(fos);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	/**
	 * This method is Used to Update the Single Data
	 * @param SheetName
	 * @param Row num
	 * @param Column Number
	 * @param TestData
	 * 
	 */
	
	public void updateSingleData_ExistingRow(String sheet,int row,int column,String data)
	{
	//Create New Row and Create Data
	wb.getSheet(sheet).createRow(row).createCell(column).setCellValue(data);	
	//Write the data
		try {
			wb.write(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	}
	