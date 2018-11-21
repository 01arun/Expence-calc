package com.data;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteExcel {
	public static void main(String[] args)throws Exception {
	      //Create Blank workbook
	      XSSFWorkbook workbook = new XSSFWorkbook(); 

	      //Create file system using specific name
	      FileOutputStream out = new FileOutputStream(new File("C:\\Users\\Arun Varghese\\eclipse-workspace\\Monthly Expence\\Data\\createworkbook1.xlsx"));

	      //write operation workbook using file out object 
	      workbook.write(out);
	      out.close();
	      workbook.close();
	      System.out.println("createworkbook.xlsx written successfully");
	}

}
