package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

import java.io.IOException;


public class dashboard01Page extends util {

    @FindBy(xpath = "//*[@id=\"int-wrapper\"]/div/app-home/div/div/div/div/app-summary-header[1]/div/div[2]/div[1]") protected WebElement btnTransactionVolume;
    @FindBy(xpath = "//*[@id=\"int-wrapper\"]/div/app-home/div/div/div/div/app-summary-header[1]/div/div[2]/div[2]") protected WebElement btnNumberofTransactions;
    @FindBy(xpath = "//*[@id=\"int-wrapper\"]/div/app-home/div/div/div/div/app-summary-header[1]/div/div[2]/div[3]") protected WebElement btnInterchangeFees;
    @FindBy(xpath = "//*[@id=\"int-wrapper\"]/div/app-home/div/div/div/div/app-summary-header[2]/div/div[2]/div[1]") protected WebElement btnNumberOfActiveMerchantIDs;
    @FindBy(xpath = "//*[@id=\"int-wrapper\"]/div/app-home/div/div/div/div/app-summary-header[2]/div/div[2]/div[2]") protected WebElement btnNumberofInterchangeRulesApplied;
    public dashboard01Page() {
        PageFactory.initElements(driver,this);
    }

    public void seleccionarOpcionesFinancialMetrics() throws InterruptedException, IOException {
        Thread.sleep(1_000);
        wait.until(ExpectedConditions.elementToBeClickable(btnTransactionVolume));
        btnTransactionVolume.click();
        Thread.sleep(1_000);
        btnNumberofTransactions.click();
        Thread.sleep(1_000);
        btnInterchangeFees.click();
        evidencias();
    }

    public void seleccionarOpcionesBusinessIntelligenceMetrics() throws InterruptedException, IOException {
        Thread.sleep(1_000);
        btnNumberOfActiveMerchantIDs.click();
        Thread.sleep(1_000);
        btnNumberofInterchangeRulesApplied.click();
        Thread.sleep(3_000);
        evidencias();
    }
}
