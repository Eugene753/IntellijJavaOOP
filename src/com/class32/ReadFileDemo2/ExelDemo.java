package com.class32.ReadFileDemo2;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExelDemo {

    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\imark\\IdeaProjects\\JavaOop\\Files\\userData.xlsx.xlsx";
        System.out.println(path);
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook exelFile=new XSSFWorkbook(fileInputStream);
        Sheet sheet1=exelFile.getSheet("Sheet1");
        Row row=sheet1.getRow(1);
        Cell cell=row.getCell(1);
        System.out.println(cell);



        /*int rowCount=sheet1.getPhysicalNumberOfRows();

        for(int i=0;i<rowCount;i++){
            Row row=sheet1.getRow(i);
            int cellCount=row.getPhysicalNumberOfCells();
            for(int j=0;j<cellCount;j++){
                Cell cell=row.getCell(j);
                System.out.print(cell + "    ");
            }
            System.out.println();
        }*/

    }
}
