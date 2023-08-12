package UmitPractice.HomePage.Umityeni;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class apachePoiWriteExcel {


    @Test
    public void writeExcel() throws IOException {


        String path ="src\\test\\java\\resources\\excelfile.xlsx";

        FileInputStream fis = new FileInputStream(path);


        Workbook workbook = WorkbookFactory.create(fis);

        Sheet sheet2  = workbook.getSheetAt(1);



        Row row1 = sheet2.getRow(0);

        Cell row1cell3 = row1.createCell(2);

        row1cell3.setCellValue("POPULATION");

        sheet2.getRow(1).createCell(2).setCellValue("Rusyanin populasyonu");
        sheet2.getRow(2).createCell(2).setCellValue("Cin in populasyonu");
        sheet2.getRow(3).createCell(2).setCellValue("Abd nin populasyonu");


        // excel dosyasyna yazma islemi

        FileOutputStream fos = new FileOutputStream(path);

        workbook.write(fos);

        fis.close();
        fos.close();

        workbook.close();























    }
}
