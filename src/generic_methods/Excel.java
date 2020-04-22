package generic_methods;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements Framework_constants {
	
	public static String getdata(String sheet,int row,int cell) {
		String V="";
		try {
			FileInputStream fis = new FileInputStream(EXCEL_PATH);
			Workbook wb = WorkbookFactory.create(fis);
			Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
		V=c.toString();
		}
		catch(Exception e)
		{
			
		}
		return V;
	}

}
