package com.HomeWork.class27;

public class FileTest {

    public static void main(String[] args) {

        File[] file={new JavaFile(".java","notepad or sublime"),new WordFile(".doc","Microsoft Word"),new PdfFile(".pdf","Adobe Reader")};

        for(File file1:file){
            file1.open();

        }




    }
}
