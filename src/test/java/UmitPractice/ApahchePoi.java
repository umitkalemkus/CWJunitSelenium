package UmitPractice;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;
import utilities.BaseTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ApahchePoi extends BaseTest {

    @Test
    public void name() throws IOException {

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Test03");
        sheet.createRow(0);
        sheet.getRow(0).createCell(0).setCellValue("Hello");
        sheet.getRow(0).createCell(1).setCellValue("World");
        sheet.getRow(0).createCell(2).setCellValue("Qatar");
        sheet.getRow(0).createCell(3).setCellValue("Wales");
        sheet.getRow(0).createCell(4).setCellValue("TerraceRoad");
        sheet.getRow(0).createCell(5).setCellValue("School");



        sheet.createRow(1);
        sheet.getRow(1).createCell(0).setCellValue("Umit");
        sheet.getRow(1).createCell(1).setCellValue("Kalemkus");
        sheet.getRow(1).createCell(2).setCellValue("Ardahan");
        sheet.getRow(1).createCell(3).setCellValue("Nahcivan");
        sheet.getRow(1).createCell(4).setCellValue(91);
        sheet.getRow(1).createCell(5).setCellValue("Siyah");



        sheet.createRow(2);
        sheet.getRow(2).createCell(0).setCellValue("Rukiye");
        sheet.getRow(2).createCell(1).setCellValue("Kalemkus");
        sheet.getRow(2).createCell(2).setCellValue("Gaziantep");
        sheet.getRow(2).createCell(3).setCellValue("Istanbul");
        sheet.getRow(2).createCell(4).setCellValue("Mount plesasnt");
        sheet.getRow(2).createCell(5).setCellValue("Beyaz");


        sheet.createRow(3);
        sheet.getRow(3).createCell(0).setCellValue("Akif");
        sheet.getRow(3).createCell(1).setCellValue("Kalemkus");
        sheet.getRow(3).createCell(2).setCellValue("Akhisar");
        sheet.getRow(3).createCell(3).setCellValue("Swansea");
        sheet.getRow(3).createCell(4).setCellValue("Besiktas");
        sheet.getRow(3).createCell(5).setCellValue("Galatasaray");




        File file  = new File("C:\\Users\\umitkalemkus\\IdeaProjects\\CWJunitSelenium\\ExcelFiles\\Test03.xls");
        FileOutputStream fos =new FileOutputStream(file);
        workbook.write(fos);
        workbook.close();














    }
}
