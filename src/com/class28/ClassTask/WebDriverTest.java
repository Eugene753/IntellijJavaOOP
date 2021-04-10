package com.class28.ClassTask;

public class WebDriverTest {

    public static void main(String[] args) {
        WebDriver[] webDriver={new ChromeDriver(),new FireFoxDriver()};

        for(WebDriver web:webDriver){
            web.openBrowser();
            web.closeBrowser();
            web.maximizeWindow();
            web.findElement();
        }
    }
}
