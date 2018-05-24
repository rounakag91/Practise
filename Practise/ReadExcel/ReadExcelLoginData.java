package ReadExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadExcelLoginData {

	static String FILE_PATH = "LoginTestData.xls";
	static String SHEET_NAME = "LoginData";
	static String[][] values = new String[5][2];

	
	
	public static void main(String args[]) throws IOException {
		
		String[][] array = readExcel();
		//System.out.println();
		//System.out.println();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(array[i][j] + ",");
			}
			System.out.println();
		}
	}

	public static String[][] readExcel() throws IOException {
		// HashMap<String, String> values = new HashMap<String, String>();
		FileInputStream file = new FileInputStream(new File(FILE_PATH));

		Workbook workbook = new HSSFWorkbook(file);
		Sheet firstsheet = workbook.getSheet(SHEET_NAME);
		Iterator<Row> iterate = firstsheet.iterator();

		while (iterate.hasNext()) {
			Row nextRow = iterate.next();
			Iterator<Cell> cellIterate = nextRow.cellIterator();
			// Util util = new Util();
			String username;
			String pwd;
			int i = nextRow.getRowNum()-1; // Get array row number
			if (nextRow.getRowNum() != 0) {
				while (cellIterate.hasNext()) {
					Cell nextcell = cellIterate.next();
					int colindex = nextcell.getColumnIndex();
					switch (colindex) {
					case 0:
						username = nextcell.getStringCellValue();
						//System.out.print(username + " ");
						values[i][0] = username;
						break;
					case 1:
						pwd = nextcell.getStringCellValue();
						//System.out.println(pwd);
						values[i][1] = pwd;

						break;
					}
				}
				//System.out.println(i);
			}
		}

		return values;

	}

}
