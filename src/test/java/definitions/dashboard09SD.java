package definitions;

import io.cucumber.java.en.And;
import pageobjects.dashboard09Page;

public class dashboard09SD {

    dashboard09Page dashboard09;
    public dashboard09SD() {
        dashboard09 = new dashboard09Page();
    }

    @And("Seleccionar opciones de Scheme Fees per Transaction by Product Type {}")
    public void seleccionarOpcionesDeSchemeFeesPerTransactionByProductType(String feesPerTransactionbyProductType) {
        dashboard09.seleccionarOpcionesSchemeFeesPerTransactionByProductType(feesPerTransactionbyProductType);
    }

    @And("Seleccionar opciones de Scheme Fee Rates by Product Type {}")
    public void seleccionarOpcionesDeSchemeFeeRatesByProductType(String ratesByProducType) throws InterruptedException {
        dashboard09.seleccionarOpcionesSchemeFeeRatesByProductType(ratesByProducType);
    }
}
