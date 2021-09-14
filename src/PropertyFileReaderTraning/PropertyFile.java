package PropertyFileReaderTraning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\imark\\IdeaProjects\\JavaOop\\Files\\Userdetails.properties";

        FileInputStream file=new FileInputStream(path);

        Properties properties=new Properties();
        properties.load(file);
        String browser=properties.getProperty("browser");
        String url=properties.getProperty("URL");
        String userName=properties.getProperty("userName");
        String password=properties.getProperty("password");
        System.out.println(browser);
        System.out.println(url);
        System.out.println(userName);
        System.out.println(password);

    }
}
