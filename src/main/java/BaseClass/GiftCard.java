package BaseClass;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GiftCard extends DwsBase {
	static String rName;
	static String rEmail;
	static String yName;
	static String yEmail;
	static String message;
	static String count;
	public void readExcel[] throws  {
		FileInputStream fis=new FileInputStream("");
		Workbook wb=	WorkbookFactory.create(fis);
		Sheet sheet =wb.getSheet("");
		rName=sheet.getRow(0).getCell(0).toString();
		rEmail=sheet.getRow(0).getCell(0).toString();
		yName=sheet.getRow(0).getCell(0).toString();
		yEmail=sheet.getRow(0).getCell(0).toString();
		message=sheet.getRow(0).getCell(0).toString();
		count=sheet.getRow(0).getCell(0).toString();
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
