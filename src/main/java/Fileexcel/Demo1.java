package Fileexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo1 {

	public static void main(String[] args) throws IOException
	{
	
		//check Excel file is present or not
		File f1 = new File(System.getProperty("user.dir")+"\\src\\main\\java\\TestData\\Testdata.xlsx");
		boolean a = f1.exists();
		System.out.println(a);
		
		//read file
		FileInputStream fis = new FileInputStream(f1);
		
		//load whole XLSX worksheet
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		String b = sheet1.getRow(7).getCell(1).getStringCellValue();
		System.out.println(b);
		
		
		
		
		
		
		
		

	}

}
