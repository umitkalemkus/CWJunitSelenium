package Day10_ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class C02_ApachePoiTask {

    @Test
    public void apahcheTask() throws IOException {


         /* Add the excel file on the resources folder.
        Open the file.
        Open the workbook using file input stream.
        Open the first worksheet.
        Go to first row.
        Go to first cell on that first row and print.
        Go to second cell on that first row and print.
        Go to 2nd row first cell and assert if the data equal to Russia.
        Go to 3rd row 2nd cell-chain the row and cell.
        Find the number of used row.
        Print country, area key value pairs as map object.
        Collapse*/
        // Open the file.
        String path ="src\\test\\java\\resources\\excelfile.xlsx";

        FileInputStream fis = new FileInputStream(path);
        // Open the workbook using file input stream.
        Workbook workbook = WorkbookFactory.create(fis);
        //  Open the first worksheet.
        Sheet sheet1 = workbook.getSheetAt(0);
        //    Go to first row.
        Row   row1 =sheet1.getRow(0);
        //  Go to first cell on that first row and print.
        Cell row1Cell1= row1.getCell(0);

        System.out.println("row1Cell1 = " + row1Cell1.toString().toLowerCase());
        
        Cell row1Cell2= row1.getCell(1);
        System.out.println("row1Cell2 = " + row1Cell2);

       // Go to 2nd row first cell and assert if the data equal to Russia.
        Row row2 = sheet1.getRow(1);
        Cell row2Cell1 =row2.getCell(0);

        Assert.assertEquals("Rusya",row2Cell1.toString());

        //Go to 3rd row 2nd cell-chain the row and cell.

        Row row3 = sheet1.getRow(2);
      //  Go to 3rd row 2nd cell-chain the row and cell.
        Cell row3Cell2 =sheet1.getRow(2).getCell(1);
        System.out.println("row3Cell2 = " + row3Cell2);


       // Find the number of used row.
        System.out.println(sheet1.getPhysicalNumberOfRows()); // tam satir sayisini almak icin bu method kullanilir.
        System.out.println(sheet1.getLastRowNum()); // indexini istersen bu methodu kullan


        //Print country, area key value pairs as map object.
         int totalRows = sheet1.getPhysicalNumberOfRows();
        Map<String,String> countryAreas = new HashMap<>();

        for (int row = 1; row<totalRows ; row++) {
            String coutry =sheet1.getRow(row).getCell(0).toString();
         //   System.out.println((row+1)+". satir ="+coutry);

            String area =sheet1.getRow(row).getCell(1).toString();

        //    System.out.println("Country = "+ coutry+ ",  Area =" + area);


         countryAreas.put(coutry,area);
        }
        System.out.println(countryAreas);

    }



}
