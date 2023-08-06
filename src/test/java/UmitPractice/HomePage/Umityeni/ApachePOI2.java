package UmitPractice.HomePage.Umityeni;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ApachePOI2 {


    public static void main(String[] args) throws IOException {


        String path ="src\\test\\java\\resources\\excelfile.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);


        Workbook workbook = WorkbookFactory.create(fileInputStream);

        Sheet sheet1 = workbook.getSheetAt(0);

        Row  row1 = sheet1.getRow(0);

        Cell row1cell1 = row1.getCell(0);

        System.out.println("row1cell1 = " + row1cell1);


        Cell row1cell2 = row1.getCell(1);
        System.out.println("row1cell2 = " + row1cell2);


        Row  row2 = sheet1.getRow(1);
        Cell row2cell1 = row2.getCell(0);
        System.out.println("row2cell1 = " + row2cell1);
        Assert.assertTrue(row2cell1.toString().contains("Rusya"));

        Row  row3 = sheet1.getRow(2);
        Cell row3cell2 = sheet1.getRow(2).getCell(1);

        System.out.println("row3cell2 = " + row3cell2);


        // find the number of used rows.

        System.out.println("sheet1.getPhysicalNumberOfRows() = " + sheet1.getPhysicalNumberOfRows());  // Satir sayisi ni verir
        System.out.println("sheet1.getLastRowNum() = " + sheet1.getLastRowNum());  // indexini verir (-1)

        int totalrows = sheet1.getPhysicalNumberOfRows();
        Map<String, String> countryAreas = new HashMap<>();

        for (int row = 1; row <totalrows ; row++) {
            String country = sheet1.getRow(row).getCell(0).toString();

            //System.out.println((row+1)+" . satir  = "+country);

            String area  = sheet1.getRow(row).getCell(1).toString();

            //System.out.println(country + " = " + area );

            countryAreas.put(country,area);


            
        }
        System.out.println("countryAreas = " + countryAreas);


    }
}
