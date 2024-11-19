package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

import java.io.IOException;

public class dashboard05Page extends util {

    @FindBy(xpath = "//*[@class='int-Btn int-priBtn' and text()='Export to Excel']") protected WebElement btnExportToExceGrowthByJurisdiction;

    public dashboard05Page() {
        PageFactory.initElements(driver, this);

    }

    public void exportarExcelGrowthByJurisdiction() throws InterruptedException, IOException {
        wait.until(ExpectedConditions.elementToBeClickable(btnExportToExceGrowthByJurisdiction));
        btnExportToExceGrowthByJurisdiction.click();
        Thread.sleep(3_000);
        evidencias();
    }

}
