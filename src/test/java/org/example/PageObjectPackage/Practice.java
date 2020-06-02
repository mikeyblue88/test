package org.example.PageObjectPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Practice extends DriverFactory {
@FindBy(id = "searchTerm")
WebElement searchbox;

@FindBy(className = "_1gqeQ")
WebElement searchbutton;

    public void dosearch(){
        searchbox.sendKeys("Nike");
}
public void doclick(){
        searchbutton.click();
}
}
