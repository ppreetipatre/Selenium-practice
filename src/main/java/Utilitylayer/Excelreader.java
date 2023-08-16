package Utilitylayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreader {
	XSSFWorkbook workbook;
	public Excelreader (String filepath) throws IOException, URISyntaxException
	{
		URL url =  getClass().getClassLoader().getResource(filepath);
		File f = new File(url.toURI());
		FileInputStream fis = new FileInputStream(f);
		workbook=new XSSFWorkbook(fis);
	
	}

	public int getTotalRowCount (int sheetindex)
	{
		return workbook.getSheetAt(sheetindex).getLastRowNum()+1;
	}
	
	public int getTotalCellCount (int sheetindex)
	{
		return workbook.getSheetAt(sheetindex).getRow(0).getLastCellNum();
	}
	 
	public Object getspecificsheetdata(int sheetindex,int row,int cells)
	{
		//Object data = null;
		String str = workbook.getSheetAt(sheetindex).getRow(row).getCell(cells).toString();
		//XSSFCell cell = workbook.getSheetAt(sheetindex).getRow(row).getCell(cells);
	return str;
//		if (cell==null)
//		{
//			return "";
//			
//		}
//		
//		
//		if(cell.getCellType()==CellType.NUMERIC)
//		{
//			return cell.getRawValue();
//		}
		//return cell.toString();
		
		
//		if(cell!=null)
//			
//		{
//			if(cell.getCellType() == CellType.BOOLEAN)
//			{
//				return cell.getStringCellValue();
//			}
//			
//			 else if (cell.getCellType() == CellType.NUMERIC) {
//				return cell.getRawValue();
//			} else if (cell.getCellType() == CellType.STRING) {
//				return cell.getBooleanCellValue();
//			} else if (cell.getCellType() == XSSFCell.CELL_TYPE_FORMULA) {
//				return cell.getCellFormula();
//			}
//		}
		
	}
		public Object [][] getallsheetdata(int sheetindex)
		{
			Object data[][]=null;
			int rows = getTotalRowCount(sheetindex);
			int cells = getTotalCellCount(sheetindex);
			data=new Object[rows][cells];
			for(int i=0;i<rows;i++)				
			{
				for(int j=0;j<cells;j++)
				{
					
					//System.out.println(str);
				data [i][j] =getspecificsheetdata(sheetindex,i,j);
				}
					
			}
			
			return data;
			
		
		}
		
		public static void main(String[] args) throws IOException, URISyntaxException {
			
			Excelreader get = new Excelreader("Testdata.xlsx");
			Object [][] ob= get.getallsheetdata(0);
			for(int i=0; i<ob.length;i++)
			{
				int k=ob[i].length;
				for(int j=0;j<k;j++)
				{
					System.out.println((String)ob[i][j].toString());	
				}
				
				
					
				}
			}
			
			
		}

		
	
	
	
	

