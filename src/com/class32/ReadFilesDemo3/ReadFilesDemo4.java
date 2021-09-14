package com.class32.ReadFilesDemo3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFilesDemo4 {

    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\imark\\IdeaProjects\\JavaOop\\Files\\Configurations2.properties";

        FileInputStream fileInputStream=new FileInputStream(path);

        Properties properties=new Properties();
        properties.load(fileInputStream);

        String browser=properties.getProperty("browser");
        String url=properties.getProperty("URL");
        System.out.println(browser);
        System.out.println(url);
    }
}
