package page_object_model.utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {


  private XSSFWorkbook workbook;
    private Sheet sheet;

    public ExcelUtils(String excelPath, String sheetName) {
        try (FileInputStream fis = new FileInputStream(new File(excelPath))) {
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            System.out.println("Error reading the Excel file: " + e.getMessage());
        }
    }

    public String getCellData(int rowNum, int colNum) {
        Row row = sheet.getRow(rowNum);
        if (row != null) {
            Cell cell = row.getCell(colNum);
            if (cell != null) {
                try {
                    switch (cell.getCellType()) {
                        case STRING:
                            return cell.getStringCellValue();
                        case NUMERIC:
                            return String.valueOf(cell.getNumericCellValue());
                        case BOOLEAN:
                            return String.valueOf(cell.getBooleanCellValue());
                        default:
                            return "Unsupported cell type";
                    }
                } catch (Exception e) {
                    System.out.println("Error reading cell data: " + e.getMessage());
                }
            } else {
                System.out.println("Cell at row " + rowNum + " and column " + colNum + " is null.");
            }
        } else {
            System.out.println("Row " + rowNum + " is null.");
        }
        return "";
    }

    public int getRowCount() {
        return sheet != null ? sheet.getPhysicalNumberOfRows() : 0;
    }

    public void closeWorkbook() {
        try {
            if (workbook != null) {
                workbook.close();
            }
        } catch (IOException e) {
            System.out.println("Error closing the workbook: " + e.getMessage());
        }
    }
}
