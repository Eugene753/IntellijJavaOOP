package com.class24.demo4;

public class WebsiteTester {

    public static void main(String[] args) {

        WebDriver webDriver=new FireFox();
        webDriver.openWebsite();
        webDriver.signupWebsite();
        webDriver.downloadAFileFromWebsite();
        webDriver.downloadAFileFromWebsite();



        /*WebDriver[] webDriverArray={new GoogleChrome(),new FireFox()};
        for(WebDriver webdriver:webDriverArray){
            webDriver.openWebsite();
            webDriver.signupWebsite();
            webDriver.downloadAFileFromWebsite();
            webDriver.downloadAFileFromWebsite();
        }*/






        /*FireFox fireFox=new FireFox();
        fireFox.openWebsite();
        fireFox.signupWebsite();
        fireFox.downloadAFileFromWebsite();
        fireFox.downloadAFileFromWebsite();

        GoogleChrome googleChrome=new GoogleChrome();
        googleChrome.openWebsite();
        googleChrome.signupWebsite();
        googleChrome.downloadAFileFromWebsite();
        googleChrome.downloadAFileFromWebsite();*/
    }
}
