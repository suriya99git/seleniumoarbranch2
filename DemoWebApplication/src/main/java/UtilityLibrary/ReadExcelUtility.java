package UtilityLibrary;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadExcelUtility {

	public String readSingleData(String Sheet,int row,int cell) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(FrameWorkConstraints.ExcelPath);

		Workbook w = WorkbookFactory.create(fis);

		Sheet s = w.getSheet(Sheet);

		Row r = s.getRow(row);

		return r.getCell(cell).toString();
	}
	/**
	 * 
	 * @param sheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public int rowSize(String sheet) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(FrameWorkConstraints.ExcelPath);

		Workbook w = WorkbookFactory.create(fis);

		Sheet s = w.getSheet(sheet);

		return s.getPhysicalNumberOfRows();


	}

	/**
	 * 
	 * @param sheet
	 * @param row
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public int celsize(String sheet,int row) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(FrameWorkConstraints.ExcelPath);

		Workbook w = WorkbookFactory.create(fis);

		Sheet s = w.getSheet(sheet);

		return s.getRow(row).getPhysicalNumberOfCells();

	}

	/**
	 * 
	 * @param sheet
	 * @param row
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	 public Object[][] readAllData(String sheet,int row) throws EncryptedDocumentException, IOException {
		 FileInputStream fis = new FileInputStream(FrameWorkConstraints.ExcelPath);

			Workbook w = WorkbookFactory.create(fis);

			Sheet s = w.getSheet(sheet);
			
			int rowsize = s.getPhysicalNumberOfRows();
			int colomsize = s.getRow(0).getPhysicalNumberOfCells();


			Object[][]d = new Object[rowsize][colomsize];
			
			for (int i = 0; i < rowsize; i++) {
				
				for (int j = 0; j < colomsize; j++) {
					
					d[i][j] = s.getRow(i).getCell(j).toString();
				}
			}
			
              return d;
		 
	 }
}
