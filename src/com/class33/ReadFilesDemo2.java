package com.class33;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ReadFilesDemo2 {

    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\imark\\IdeaProjects\\JavaOop\\Files\\userData.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        Map<String,String> map;
        int noOfRowsInASheet=sheet.getPhysicalNumberOfRows();
        for(int i=1;i<noOfRowsInASheet;i++){
            Row row=sheet.getRow(i);
            int noOfCells=row.getPhysicalNumberOfCells();
            map=new HashMap<>();
            for(int j=0;j<noOfCells;j++){
                /* Cell cell=row.getCell(j);
                System.out.print(cell+" ");*/
                String key=sheet.getRow(0).getCell(j).toString();
                String value=row.getCell(j).toString();
                //System.out.println(cell);
                System.out.print(key+" "+value+" ");
                map.put(key,value);

            }
            System.out.println();
        }
        //System.out.println(rows);




    }
}
