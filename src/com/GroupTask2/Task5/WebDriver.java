package com.GroupTask2.Task5;


public interface WebDriver {
    void open();
    void close();
    String getTitle();
}

interface RemoteWebDriver extends WebDriver {
    void navigate();
}

interface TakesScreenshot extends RemoteWebDriver{
    void getScreenshot();
}

class ChromeDrive implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Google Chrome web browser open");
    }

    @Override
    public void close() {
        System.out.println("Google Chrome web browser close");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to google.com");
    }
}
class FireFox implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("FireFox web browser open");
    }

    @Override
    public void close() {
        System.out.println("FireFox web browser close");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to firefox.com");
    }
}
class SafariDrive implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Safari web browser open");
    }

    @Override
    public void close() {
        System.out.println("Safari web browser open");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to safari.com");
    }
}