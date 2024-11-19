package pageobjects;

import com.sun.jdi.ThreadGroupReference;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class dashboard09Page extends util {

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/div[1]/button") protected WebElement btnCerrarPopUp;

    public dashboard09Page() {
        PageFactory.initElements(driver,this);
    }

    public void seleccionarOpcionesSchemeFeesPerTransactionByProductType(String feesPerTransactionbyProductType) {
        String xpath = "//*[contains(@id, 'chart-serieDataLabelClickable-695c4478-248c-495c-9cfd-06a8fd0db3a4') and @aria-label[contains(.,'" + feesPerTransactionbyProductType + "')]]";
        try {
            // Esperar hasta que la barra específica sea clickeable y hacer clic
            WebElement popUp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            popUp.click();

            System.out.println("Abrir el pop-up de: " + feesPerTransactionbyProductType);
        } catch (Exception e) {
            System.out.println("PopUp not found or not clickable: " + feesPerTransactionbyProductType);
        }

        //Cerrar pop-up
        wait.until(ExpectedConditions.elementToBeClickable(btnCerrarPopUp));
        btnCerrarPopUp.click();
    }

    public void seleccionarOpcionesSchemeFeeRatesByProductType(String ratesByProducType) throws InterruptedException {
        String xpath = "//*[contains(@id, 'chart-serieDataLabelClickable-69ea9ddc-a411-468f-9378-950e9ea1d91e') and @aria-label[contains(.,'" + ratesByProducType + "')]]";
        try {
            // Esperar hasta que la barra específica sea clickeable y hacer clic
            WebElement popUp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            popUp.click();

            System.out.println("Abrir el pop-up de: " + ratesByProducType);
        } catch (Exception e) {
            System.out.println("PopUp not found or not clickable: " + ratesByProducType);
        }

        //Cerrar pop-up
        wait.until(ExpectedConditions.elementToBeClickable(btnCerrarPopUp));
        btnCerrarPopUp.click();
        Thread.sleep(3_000);
    }
}
