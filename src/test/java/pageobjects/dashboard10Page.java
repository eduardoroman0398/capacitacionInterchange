package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

import java.io.IOException;

public class dashboard10Page extends util {

    @FindBy(xpath = "//*[@id=\"int-wrapper\"]/div/app-home/div/div/app-top-product-mcc/div/div[1]/div[1]/button") protected WebElement btnViewMoreTop10ProductswiththeHighestSchemeFees;
    @FindBy(xpath = "//*[@id=\"int-wrapper\"]/div/app-home/div/div/app-top-product-mcc/div/div[2]/div[1]/button") protected WebElement btnViewMoreTopMCCsWithTheHighestSchemeFees;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/div[1]/button") protected WebElement btnCerrarPopUp;

    public dashboard10Page() {
        PageFactory.initElements(driver,this);
    }

    public void SeleccionarTop10ProductswiththeHighestSchemeFees() {
        wait.until(ExpectedConditions.elementToBeClickable(btnViewMoreTop10ProductswiththeHighestSchemeFees));
        btnViewMoreTop10ProductswiththeHighestSchemeFees.click();
        System.out.println("Se selecciono el boton de View More de Top10ProductswiththeHighestSchemeFees");

        //Cerrar el popuP
        wait.until(ExpectedConditions.elementToBeClickable(btnCerrarPopUp));
        btnCerrarPopUp.click();
    }

    public void seleccionarTopMCCsWithTheHighestSchemeFees() throws IOException, InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(btnViewMoreTopMCCsWithTheHighestSchemeFees));
        btnViewMoreTopMCCsWithTheHighestSchemeFees.click();
        System.out.println("Se selecciono el boton de View More de btnViewMoreTopMCCsWithTheHighestSchemeFees");

        //Cerrar el popuP
        wait.until(ExpectedConditions.elementToBeClickable(btnCerrarPopUp));
        btnCerrarPopUp.click();
        Thread.sleep(3_000);
        evidencias();
    }
}
