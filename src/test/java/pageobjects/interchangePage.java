package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

import java.io.IOException;

public class interchangePage extends util {

    @FindBy(xpath = "//*[@id=\"ej2_dropdownlist_2\"]/span/span") protected WebElement cmbListado;
    @FindBy(xpath = "//*[@id=\"int-wrapper\"]/div/app-home/div/app-dashboard-actions/div[2]/div/div[2]") protected WebElement cmbNegocio;
    @FindBy(xpath = "//*[@id=\"int-wrapper\"]/div/app-home/div/app-dashboard-actions/div[2]/div/div[3]") protected WebElement cmbTransaccion;
    @FindBy(xpath = "//*[@id=\"int-wrapper\"]/div/app-home/div/app-dashboard-actions/div[1]/app-actions-menu") protected WebElement menuLocal;
    @FindBy(xpath = "//button[@class='int-Btn int-priBtn btn-fixed applyAnalytics']") protected WebElement applyButton;



    public interchangePage() {
        PageFactory.initElements(driver,this);
    }

    public void seleccionarDashboard(String dashboard) throws InterruptedException, IOException {
        Thread.sleep(8_000);
        cmbListado.click();
        WebElement dropdownOption = driver.findElement(By.xpath("//li[contains(text(), '" + dashboard + "')]"));
        Thread.sleep(2_000);
        dropdownOption.click();
        evidencias();
    }

    public void seleccionarFiltroGlobaNegocio(String negocio) throws InterruptedException, IOException {
        Thread.sleep(15_000);
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(cmbNegocio));
        dropdown.click();

        // Espera que las opciones se desplieguen y selecciona la opción por su texto visible
        WebElement optionElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='" + negocio + "']")));
        Thread.sleep(1_000);
        optionElement.click();
        evidencias();
        System.out.println("El negocio seleccionado es: " + negocio);
    }

    public void seleccionarFiltroGlobalTransaccion(String transaccion) throws InterruptedException {
        Thread.sleep(3_000);
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(cmbTransaccion));
        dropdown.click();
        Thread.sleep(1_000);
        // Espera que las opciones se desplieguen y selecciona la opción por su texto visible
        WebElement optionElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='" + transaccion + "']")));
        optionElement.click();
        System.out.println("El negocio seleccionado es: " + transaccion);
    }

    public void seleccionarAccionExportToPDF(String accion) throws InterruptedException {
        Thread.sleep(5_000);
        WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(menuLocal));
        menu.click();

        // Espera que las opciones se desplieguen y selecciona la opción por su texto visible
        Thread.sleep(2_000);
        WebElement actionOption = driver.findElement(By.xpath("//span[text()='" + accion + "']"));

        // Use JavascriptExecutor to click the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", actionOption);
        System.out.println("La accion seleccionada es: " + accion);
    }

    public void seleccionarAccionFiltrosLocales(String accion) throws InterruptedException {
        Thread.sleep(8_000);
        WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(menuLocal));
        menu.click();

        // Espera que las opciones se desplieguen y selecciona la opción por su texto visible
        Thread.sleep(2_000);
        WebElement actionButton = driver.findElement(By.xpath("//span[text()='" + accion + "']/parent::button"));
        actionButton.click();
        // Use JavascriptExecutor to click the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", actionButton);
        System.out.println("La accion seleccionada es: " + accion);
    }

    public void selectCountry(String country) throws InterruptedException {
        WebElement countryDropdown = driver.findElement(By.id("ej2_dropdownlist_3"));
        countryDropdown.click();
        Thread.sleep(1_000);
        WebElement countryOption = driver.findElement(By.xpath("//li[contains(text(),'" + country + "')]"));
        countryOption.click();
        countryDropdown.click();
        System.out.println("El country seleccionado es: " + country);
    }

    public void selectBrand(String brand) throws InterruptedException {
        WebElement brandDropdown = driver.findElement(By.id("ej2_dropdownlist_4"));
        brandDropdown.click();
        Thread.sleep(1_000);
        WebElement brandOption = driver.findElement(By.xpath("//li[contains(text(),'" + brand + "')]"));
        brandOption.click();
        brandDropdown.click();
        System.out.println("El brand seleccionado es: " + brand);
    }

    public void selectJurisdiction(String jurisdiction) throws InterruptedException {
        WebElement jurisdictionDropdown = driver.findElement(By.id("ej2_dropdownlist_5"));
        Thread.sleep(2_000);
        jurisdictionDropdown.click();
        WebElement jurisdictionOption = driver.findElement(By.xpath("//li[contains(text(),'" + jurisdiction + "')]"));
        jurisdictionOption.click();
        Thread.sleep(2_000);
        jurisdictionDropdown.click();
        System.out.println("El jurisdiction seleccionado es: " + jurisdiction);
    }

    /*public void selectStartDate(String startDate) throws InterruptedException {
        // Hacer clic en el icono del calendario
        WebElement calendarIcon = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.e-date-icon")));
        Thread.sleep(1_000);
        calendarIcon.click();

        // Separar el mes y el año de la cadena "January 2023"
        String[] partesFecha = startDate.split(" ");
        String mes = partesFecha[0];
        String anio = partesFecha[1];

        // Esperar a que el desplegable del año esté disponible y seleccionar el año
        WebElement yearDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".e-date-picker .e-input-group")));
        yearDropdown.click();
        Thread.sleep(1_000);
        WebElement selectedYear = driver.findElement(By.xpath("//span[text()='" + anio + "']"));
        selectedYear.click();
        Thread.sleep(1_000);

        // Seleccionar el mes
        WebElement selectedMonth = driver.findElement(By.xpath("//span[text()='" + mes + "']"));
        Thread.sleep(1_000);
        selectedMonth.click();
        System.out.println("El startDate seleccionado es: " + startDate);
    }

    public void selectEndDate(String endDate) throws InterruptedException {
        WebElement endDatePicker = driver.findElement(By.id("ej2-datepicker_7_input"));
        Thread.sleep(1_000);
        endDatePicker.click();
        endDatePicker.clear();
        endDatePicker.sendKeys(endDate);
        System.out.println("El endDate seleccionado es: " + endDate);
    }*/

    public void selectProductProgram(String productProgram) throws InterruptedException {
        WebElement programDropdown = driver.findElement(By.id("ej2_dropdownlist_8"));
        Thread.sleep(1_000);
        programDropdown.click();
        WebElement programOption = driver.findElement(By.xpath("//li[contains(text(),'" + productProgram + "')]"));
        programOption.click();
        programDropdown.click();
        System.out.println("El productProgram seleccionado es: " + productProgram);
    }

    public void selectProduct(String product) throws InterruptedException {
        WebElement productDropdown = driver.findElement(By.id("ej2_dropdownlist_9"));
        Thread.sleep(1_000);
        productDropdown.click();
        WebElement productOption = driver.findElement(By.xpath("//li[contains(text(),'" + product + "')]"));
        productOption.click();
        productDropdown.click();
        System.out.println("El product seleccionado es: " + product);
    }
    public void selectFunding(String funding) throws InterruptedException {
        WebElement fundingDropdown = driver.findElement(By.id("ej2_dropdownlist_10"));
        Thread.sleep(1_000);
        fundingDropdown.click();
        WebElement fundingOption = driver.findElement(By.xpath("//li[contains(text(),'" + funding + "')]"));
        fundingOption.click();
        fundingDropdown.click();
        System.out.println("El funding seleccionado es: " + funding);
    }

    public void selectCard(String card) throws InterruptedException {
        WebElement cardDropdown = driver.findElement(By.id("ej2_dropdownlist_11"));
        Thread.sleep(1_000);
        cardDropdown.click();
        WebElement cardOption = driver.findElement(By.xpath("//li[contains(text(),'" + card + "')]"));
        cardOption.click();
        cardDropdown.click();
        System.out.println("El card seleccionado es: " + card);
    }

    public void clickApply() throws InterruptedException {
        Thread.sleep(1_000);
        applyButton.click();
    }

}



