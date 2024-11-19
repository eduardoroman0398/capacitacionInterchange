package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class dashboard11Page extends util {

    @FindBy(xpath = "//*[@id=\"int-wrapper\"]/div/app-home/div/div/app-scheme-analysis/div/div[2]/div[1]/div[1]/button") protected WebElement btnExportToExcelGrowthbyJurisdiction;
    @FindBy(xpath = "//*[@id=\"int-wrapper\"]/div/app-home/div/div/app-scheme-analysis/div/div[2]/div[2]/div[1]/button") protected WebElement btnViewMoreGrowthByProductType;
    @FindBy(xpath = "//*[@id=\"int-wrapper\"]/div/app-home/div/div/app-scheme-analysis/div/div[2]/div[3]/div[1]/button") protected WebElement btnViewMoreGrowthForTopMCCs;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/div[1]/button") protected WebElement btnCerrarPopUp;


    public dashboard11Page() {
        PageFactory.initElements(driver,this);
    }

    public void ExportarexceldeGrowthByJurisdiction() {
        wait.until(ExpectedConditions.elementToBeClickable(btnExportToExcelGrowthbyJurisdiction));
        btnExportToExcelGrowthbyJurisdiction.click();
        System.out.println("Se clickeo en el boton exportar excel de GrowthbyJurisdiction");
    }

    public void seleccionarViewMoreGrowthByProductType() {
        wait.until(ExpectedConditions.elementToBeClickable(btnViewMoreGrowthByProductType));
        btnViewMoreGrowthByProductType.click();
        System.out.println("Se clickeo en el boton View More de GrowthByProductType");

        //Cerrar popUp
        wait.until(ExpectedConditions.elementToBeClickable(btnCerrarPopUp));
        btnCerrarPopUp.click();
    }


    public void seleccionarViewMoreGrowthForTopMCCs() {
        wait.until(ExpectedConditions.elementToBeClickable(btnViewMoreGrowthForTopMCCs));
        btnViewMoreGrowthForTopMCCs.click();
        System.out.println("Se clickeo en el boton View More de GrowthForTopMCCs");

        //Cerrar popUp
        wait.until(ExpectedConditions.elementToBeClickable(btnCerrarPopUp));
        btnCerrarPopUp.click();
    }
}
