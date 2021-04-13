package com.GroupTask2.Task5;

public class WebDriverTest {

    public static void main(String[] args) {
        WebDriver[] webDriver={new ChromeDrive(),new FireFox(),new SafariDrive()};

        for(WebDriver w:webDriver){
            w.open();
            w.getTitle();
            w.close();
            if(w instanceof ChromeDrive){
                ((ChromeDrive) w).navigate();
            }if(w instanceof FireFox){
                ((FireFox) w).navigate();
            }if(w instanceof SafariDrive){
                ((SafariDrive) w).navigate();
            }
        }
    }
}
