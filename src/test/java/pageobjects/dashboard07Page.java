package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class dashboard07Page extends util {

    @FindBy(xpath = "//*[@id=\"int-wrapper\"]/div/app-home/div/div/app-transaction-analysis/div/div[2]/div[1]/div[1]/button") protected WebElement btnExportarExcelGrowthByJurisdiction;



    public dashboard07Page() {
        PageFactory.initElements(driver,this);
    }

    public void exportarExcelDeLaSeccionGrowthByJurisdiction(){
        wait.until(ExpectedConditions.elementToBeClickable(btnExportarExcelGrowthByJurisdiction));
        btnExportarExcelGrowthByJurisdiction.click();
        System.out.println("El boton de la seccion Growth By Jurisdiction se ha clickeado");
    }
}
