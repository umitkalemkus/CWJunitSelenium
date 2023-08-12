package UmitPractice.HomePage.Umityeni;

import com.github.javafaker.Faker;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.*;

public class ApachiPoiWriteExcel2 {

    @Test
    public void name() throws IOException {
        String filepath = "src\\test\\java\\resources\\excelData.xlsx";
        File file = new File(filepath);
        FileInputStream fis = new FileInputStream(file);
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet informationData = workbook.getSheet("informationData");
        int totalRowUsed = informationData.getLastRowNum() - informationData.getFirstRowNum();
        System.out.println("total Row = " + totalRowUsed);
       /*  Row row4 =  informationData.getRow(4);
        System.out.println("row4 = " + row4);
*/



        Faker faker = new Faker();
        Row row5 =  informationData.createRow(4);
        row5.createCell(0).setCellValue(faker.name().firstName());
        row5.createCell(1).setCellValue(faker.name().lastName());
        row5.createCell(2).setCellValue(faker.internet().emailAddress());
        row5.createCell(3).setCellValue(faker.zelda().character());
        row5.createCell(4).setCellValue(faker.phoneNumber().cellPhone());
        row5.createCell(5).setCellValue(faker.address().streetAddress());

        Row row6 =  informationData.createRow(5);
        row6.createCell(0).setCellValue(faker.name().firstName());
        row6.createCell(1).setCellValue(faker.name().lastName());
        row6.createCell(2).setCellValue(faker.internet().emailAddress());
        row6.createCell(3).setCellValue(faker.zelda().character());
        row6.createCell(4).setCellValue(faker.phoneNumber().cellPhone());
        row6.createCell(5).setCellValue(faker.address().streetAddress());

        Row row7 =  informationData.createRow(6);
        row7.createCell(0).setCellValue(faker.name().firstName());
        row7.createCell(1).setCellValue(faker.name().lastName());
        row7.createCell(2).setCellValue(faker.internet().emailAddress());
        row7.createCell(3).setCellValue(faker.zelda().character());
        row7.createCell(4).setCellValue(faker.phoneNumber().cellPhone());
        row7.createCell(5).setCellValue(faker.address().streetAddress());




        FileOutputStream fos = new FileOutputStream(file);

        workbook.write(fos);
        fis.close();
        fos.close();
        workbook.close();


    }









}
