package definitions;

import io.cucumber.java.en.And;
import pageobjects.dashboard08Page;

import java.io.IOException;

public class dashboard08SD {

    dashboard08Page dashboard08;
    public dashboard08SD() {
        dashboard08 = new dashboard08Page();
    }

    @And("Seleccionar opciones de Scheme Fees by Jurisdiction {}")
    public void SeleccionaropcionesDeSchemeFeesbyJurisdiction(String feesJurisdiction){
        dashboard08.seleccionarOpcionesSchemeFeesByJurisdiction(feesJurisdiction);
    }

    @And("Seleccionar opciones de Scheme Rates by Jurisdiction {}")
    public void seleccionarOpcionesDeSchemeRatesByJurisdiction(String ratesJurisdiction) {
        dashboard08.seleccionarOpcionesSchemeRatesByJurisdiction(ratesJurisdiction);
    }

    @And("Seleccionar opciones de Scheme Fees by ProductType {}")
    public void seleccionarOpcionesDeSchemeFeesByProductType(String feesProductType) {
        dashboard08.seleccionarOpcionesSchemeFeesByProductType(feesProductType);
    }

    @And("Seleccionar opciones de Scheme Rates by Product Type {}")
    public void seleccionarOpcionesDeSchemeRatesByProductType(String ratesProducType) throws IOException, InterruptedException {
        dashboard08.seleccionarOpcionesSchemeRatesByProductType(ratesProducType);
    }

}
