package pageobjects;

import definitions.hooks;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

import java.io.IOException;
import java.util.Objects;


public class portalPage extends util {

    @FindBy(xpath = "//*[@id=\"ej2_dropdownlist_1\"]/span/input") protected WebElement cmbPerfil;
    @FindBy(xpath = "//*[@id=\"btn-menu\"]") protected WebElement btnMenuPrincipal;
    @FindBy(xpath = "//*[@id=\"default-sidebar\"]/div/nav/ul/li[3]") protected WebElement btnInterchange;



    public portalPage() {
        PageFactory.initElements(driver,this);
    }
    Actions actions = new Actions(driver);

    public void seleccionarPerfil(String perfil) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(cmbPerfil));
        cmbPerfil.click();
        Thread.sleep(2_000);
        cmbPerfil.sendKeys(perfil);
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        System.out.println("El perfil seleccionado es: " + perfil);
    }

    public void ingresaNuevaUrl(String nuevaUrl) throws InterruptedException, IOException {
        if (Objects.equals(nuevaUrl, "Interchange_URL_UAT")){
            Thread.sleep(2_000);
            driver.get(Interchange_URL_UAT);
            System.out.println("Ingresamos a la nueva url: " + nuevaUrl);
        }

        if (Objects.equals(nuevaUrl, "Interchange_URL")){
            Thread.sleep(2_000);
            driver.get(Interchange_URL);
            System.out.println("Ingresamos a la nueva url: " + nuevaUrl);
        }

        Thread.sleep(3_000);
        evidencias();
    }

}
