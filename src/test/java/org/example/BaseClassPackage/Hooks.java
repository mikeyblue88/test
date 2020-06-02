package org.example.BaseClassPackage;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory();

    public void setup(){
        driverFactory.openBrowser();
    }

    public void teardown(){
        driverFactory.closeBrowser();
    }
}
