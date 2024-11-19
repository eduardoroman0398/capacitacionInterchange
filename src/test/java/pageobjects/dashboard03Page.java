package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import support.util;

import java.util.List;

public class dashboard03Page extends util {

    public dashboard03Page() {
        PageFactory.initElements(driver,this);
    }

    public void validar_Nombres_de_MCC(String mccName) throws InterruptedException {
        Thread.sleep(3_000);
        // Extraer los nombres de MCC desde la página
        List<WebElement> elements = driver.findElements(By.cssSelector("div.chartArea .title"));

        // Almacenar los nombres en una lista de Strings
        boolean found = false;
        for (WebElement element : elements) {
            String actualName = element.getText().trim();
            System.out.println("Texto extraído: " + actualName);  // Imprimir los textos extraídos para ver su contenido

            if (actualName.contains(mccName)) {
                found = true;
                break;
            }
        }
        Thread.sleep(3_000);
        // Verificación
        Assert.assertTrue("El nombre esperado no se encontró: " + mccName, found);
    }
}
