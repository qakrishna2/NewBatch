package java_classes;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadi4ng {
	
	public static void main(String[] args) throws IOException {
		
		Workbook wb = new XSSFWorkbook();
		
		Sheet sheet = wb.createSheet("Test");
		
		Row row = sheet.createRow(0);
			
		CellStyle style = wb.createCellStyle();
		style.setFillBackgroundColor(IndexedColors.AQUA.getIndex());
		Cell cell = row.createCell((short) 1);
		cell.setCellValue("X");
		cell.setCellStyle(style);
		
			
		wb.write(new FileOutputStream("C:\\\\Users\\\\Varsha\\\\Desktop\\\\Book4.xlsx"));
		
		
		
		/*for(int i=0;i<rowSize;i++)
		{
			int cellCount = sheet.getRow(i).getLastCellNum();
			
				for(int j=0;j<cellCount;j++)
				{
					Cell cell = sheet.getRow(i).getCell(j);
					if(cell.getCellType()==org.apache.poi.ss.usermodel.CellType.NUMERIC)
					{
						System.out.println(cell.getNumericCellValue());
					}else
					{
						System.out.println(cell.getStringCellValue());
					}
					
				}
		}*/
		
	}

}
