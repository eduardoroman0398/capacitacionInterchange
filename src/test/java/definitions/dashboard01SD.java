package definitions;

import io.cucumber.java.en.And;
import pageobjects.dashboard01Page;

import java.io.IOException;

public class dashboard01SD {
    dashboard01Page summary;

    public dashboard01SD() {
        summary = new dashboard01Page();
    }

    @And("Seleccionamos opciones de Financial Metrics")
    public void seleccionamosOpcionesFinancialMetrics() throws InterruptedException, IOException {
        summary.seleccionarOpcionesFinancialMetrics();
    }

    @And("Seleccionamos opciones de Business Intelligence Metrics")
    public void seleccionamosOpcionesDeBusinessIntelligenceMetrics() throws InterruptedException, IOException {
        summary.seleccionarOpcionesBusinessIntelligenceMetrics();
    }
}
