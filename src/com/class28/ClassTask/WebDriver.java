package com.class28.ClassTask;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opens Chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Chrome browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing window of Chrome browser");
    }

    @Override
    public void findElement() {
        System.out.println("Find elemnt of Chrome browser");
    }
}
class FireFoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opens FireFox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close FireFox browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing window of FireFox browser");
    }

    @Override
    public void findElement() {
        System.out.println("Find elemnt of FireFox browser");
    }
}
