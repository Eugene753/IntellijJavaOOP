package com.class33;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFilesDemo4 {

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\imark\\IdeaProjects\\JavaOop\\Files\\userData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        int noOfRows=sheet.getPhysicalNumberOfRows();
        ArrayList<Person7> arrayList=new ArrayList<>();
        for(int i = 0; i<noOfRows; i++){
            Row row=sheet.getRow(i);
            String firstName=row.getCell(0).toString();
            String lastName=row.getCell(1).toString();
            String gender=row.getCell(2).toString();

            Person7 person=new Person7(firstName,lastName,gender);
            arrayList.add(person);
        }
        for(Person7 p:arrayList){
            System.out.println(p);
        }

    }
}
