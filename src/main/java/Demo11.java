import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo11 {

	public static void main(String[] args) throws URISyntaxException, IOException {
		URL url =  Demo11.class.getResource("Testdata.xlsx");

		File f = new File(url.toURI());
		FileInputStream fir = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fir);
		int rowNum = workbook.getSheetAt(0).getLastRowNum();
		int cellNum = workbook.getSheetAt(0).getRow(0).getLastCellNum();
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		
		XSSFRow row = sheet1.getRow(1);
		XSSFCell cells= row.getCell(0);
		//System.out.print("ROW: "+row.);
		row.forEach(System.out::println);
		System.out.print("CELLS: "+cells.toString());
		
	}

}
