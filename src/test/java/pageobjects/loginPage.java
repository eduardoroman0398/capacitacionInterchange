package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import support.util;

import java.util.Objects;

public class loginPage extends util{

    @FindBy(id = "userLogin") protected WebElement lblUsuario;
    @FindBy(id = "pwd") protected WebElement lblPassword;
    @FindBy(id = "btnTokenAnalytics") protected WebElement btnGenerateToken;
    @FindBy(xpath = "(//*[contains(text(),'Security Questions')])[3]") protected WebElement txtSeguridad;


    public loginPage() {
        PageFactory.initElements(driver,this);
    }

    public void ingresarAlAmbiente(String ambiente) throws InterruptedException {
        if (Objects.equals(ambiente, "QA")) {
            Thread.sleep(2_000);
            driver.get(QA_URL);
            System.out.println("Ingresamos a la url: " + ambiente);
        }

        if (Objects.equals(ambiente, "UAT")) {
            Thread.sleep(2_000);
            driver.get(UAT_URL);
            System.out.println("Ingresamos a la url: " + ambiente);
        }
    }
    public void ingresarCredenciales(String usuario, String contrasena){
        wait.until(ExpectedConditions.elementToBeClickable(lblUsuario));
        lblUsuario.click();
        lblUsuario.sendKeys(usuario);

        lblPassword.click();
        lblPassword.sendKeys(contrasena);

        System.out.println("El usuario ingresado es: " + usuario);
        System.out.println("La contrasena ingresada es: " + contrasena);
    }

    public void clickBotonGenerateToken(){
        btnGenerateToken.click();
    }

    public void verificarInicioDeSesion(String textoEsperado) {
        wait.until(ExpectedConditions.visibilityOf(txtSeguridad));
        String textoActual = txtSeguridad.getText();
        Assert.assertEquals("El texto visible no coincide", textoEsperado, textoActual);

        // Mensaje de éxito si la assertion pasa
        System.out.println("Assertion completada: El texto visible coincide con el esperado y es: " + textoEsperado);
    }


}

