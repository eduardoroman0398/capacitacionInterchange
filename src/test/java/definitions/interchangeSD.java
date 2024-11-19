package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.interchangePage;

import java.io.IOException;

public class interchangeSD {

    interchangePage interchange;

    public interchangeSD() {
        interchange = new interchangePage();
    }

    @And("Seleccionamos dashboard {}")
    public void seleccionamosDashboard(String dashboard) throws InterruptedException, IOException {
        interchange.seleccionarDashboard(dashboard);
    }

    @And("Seleccionamos filtro global negocio {}")
    public void seleccionamosFiltroGlobalNegocio(String negocio) throws InterruptedException, IOException {
        interchange.seleccionarFiltroGlobaNegocio(negocio);
    }

    @And("Seleccionamos filtro global transaccion {}")
    public void seleccionamosFiltroGlobalTransaccion(String transaccion) throws InterruptedException, IOException {
        interchange.seleccionarFiltroGlobalTransaccion(transaccion);
    }

    @Then("Seleccionamos la accion Export to PDF {}")
    public void seleccionamosLaAccionExportarToPDF(String accion) throws InterruptedException, IOException {
        interchange.seleccionarAccionExportToPDF(accion);
    }

    @And("Seleccionamos la accion Filtros locales {}")
    public void seleccionamosLaAccionFiltrosLocales(String accion) throws InterruptedException {
        interchange.seleccionarAccionFiltrosLocales(accion);
    }

    @And("Rellenamos campos {}, {}, {}, {}, {}, {}, {}, {}, {}")
    public void rellenamosCampos(String country, String brand, String jurisdiction, String startDate, String endDate, String productProgram, String product, String funding, String card) throws InterruptedException, IOException {
        interchange.selectCountry(country);
        interchange.selectBrand(brand);
        interchange.selectJurisdiction(jurisdiction);
        //interchange.selectStartDate(startDate);
        //interchange.selectEndDate(endDate);
        interchange.selectProductProgram(productProgram);
        interchange.selectProduct(product);
        interchange.selectFunding(funding);
        interchange.selectCard(card);
        interchange.clickApply();
        Thread.sleep(3_000);
    }
}
