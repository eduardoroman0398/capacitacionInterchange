package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class dashboard04Page extends util {


    public dashboard04Page() {
        PageFactory.initElements(driver, this);
    }


}
