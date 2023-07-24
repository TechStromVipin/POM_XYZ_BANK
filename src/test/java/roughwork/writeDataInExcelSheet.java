package roughwork;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeDataInExcelSheet {
	
	public static void UpdateExcel() throws IOException
	{
		XSSFWorkbook book = new XSSFWorkbook();

		XSSFSheet sheet = book.createSheet("stundent date");

		HashMap<String, String> s = new HashMap<String, String>();

		s.put("1", "Vipin"); 
		s.put("2", "Borole");
		s.put("3", "vijaya");
		s.put("4", "Borole");
		
		

		int row = 0;		
		 

		for (Map.Entry<String, String> f : s.entrySet()) {

			XSSFRow rows = sheet.createRow(row++);

			           
			
			
			rows.createCell(0).setCellValue(f.getKey());
			rows.createCell(1).setCellValue(f.getValue());
			 

		}

		FileOutputStream out = new FileOutputStream(".\\test-output\\excelfiles\\student.xlsx");

		book.write(out);
 
		out.close();

		System.out.println("excell sheet writting done");

		// use testoutput as output for creating excels
		
		
	}
	
	 

}
