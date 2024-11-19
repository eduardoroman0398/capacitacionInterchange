package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class dashboard08Page extends util {

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/div[1]/button") protected WebElement btnCerrarPopUp;

    public dashboard08Page() {
        PageFactory.initElements(driver,this);
    }

    public void seleccionarOpcionesSchemeFeesByJurisdiction(String feesJurisdiction){
        String xpath = "//*[contains(@id, 'chart-serieDataLabelClickable-8bc4ea1a-037c-420d-ba31-1bf56255f8e6') and @aria-label[contains(.,'" + feesJurisdiction + "')]]";
        // //*[contains(@id, 'chart-serieDataLabelClickable-5fb36aa5-15ba-46b6-b1be-f953a41ff1e9') and @aria-label[contains(.,'Intraregional')]]
        try {
        WebElement popUp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        popUp.click();
            System.out.println("Abrir el pop-up de: " + feesJurisdiction);
        } catch (Exception e) {
            System.out.println("PopUp not found or not clickable: " + feesJurisdiction);
        }
        //Cerrar pop-up
        //wait.until(ExpectedConditions.elementToBeClickable(btnCerrarPopUp));
        //btnCerrarPopUp.click();
    }

    public void seleccionarOpcionesSchemeRatesByJurisdiction(String ratesJurisdiction){
        String xpath = "//*[contains(@id, 'chart-serieDataLabelClickable-c78fba28-cb93-4ccd-9751-cca5eff4bb1e') and @aria-label[contains(.,'" + ratesJurisdiction + "')]]";
        try {
            // Esperar hasta que la barra específica sea clickeable y hacer clic
            WebElement popUp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            popUp.click();

            System.out.println("Abrir el pop-up de: " + ratesJurisdiction);
        } catch (Exception e) {
            System.out.println("PopUp not found or not clickable: " + ratesJurisdiction);
        }

        //Cerrar pop-up
        wait.until(ExpectedConditions.elementToBeClickable(btnCerrarPopUp));
        btnCerrarPopUp.click();
    }

    public void seleccionarOpcionesSchemeFeesByProductType(String feesProductType) {
        String xpath = "//*[contains(@id, 'chart-serieDataLabelClickable-86e69995-06e1-4749-b8e8-6fad2122f7a6') and @aria-label[contains(.,'" + feesProductType + "')]]";
        try {
            // Esperar hasta que la barra específica sea clickeable y hacer clic
            WebElement popUp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            popUp.click();

            System.out.println("Abrir el pop-up de: " + feesProductType);
        } catch (Exception e) {
            System.out.println("PopUp not found or not clickable: " + feesProductType);
        }

        //Cerrar pop-up
        wait.until(ExpectedConditions.elementToBeClickable(btnCerrarPopUp));
        btnCerrarPopUp.click();
    }

    public void seleccionarOpcionesSchemeRatesByProductType(String ratesProducType) {
        String xpath = "//*[contains(@id, 'chart-serieDataLabelClickable-6e1548dd-2b2b-4e82-b289-fb9e706608c3') and @aria-label[contains(.,'" + ratesProducType + "')]]";
        try {
            // Esperar hasta que la barra específica sea clickeable y hacer clic
            WebElement popUp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            popUp.click();

            System.out.println("Abrir el pop-up de: " + ratesProducType);
        } catch (Exception e) {
            System.out.println("PopUp not found or not clickable: " + ratesProducType);
        }

        //Cerrar pop-up
        wait.until(ExpectedConditions.elementToBeClickable(btnCerrarPopUp));
        btnCerrarPopUp.click();
    }


}
