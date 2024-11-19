package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

import java.io.IOException;


public class dashboard06Page extends util {


    public dashboard06Page() {
        PageFactory.initElements(driver, this);
    }

    public void seleccionarOpcionesDeDashboard06(String productType) throws InterruptedException, IOException {
        String xpath = "//*[contains(@id, 'Series_0_Point_') and @aria-label[contains(.,'" + productType + "')]]";

        try {
            // Esperar hasta que la barra específica sea clickeable y hacer clic
            WebElement bar = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            bar.click();

            System.out.println("Popup opened for feature: " + productType);
        } catch (Exception e) {
            System.out.println("Feature not found or not clickable: " + productType);
        }
        Thread.sleep(3_000);
        evidencias();

    }

}
