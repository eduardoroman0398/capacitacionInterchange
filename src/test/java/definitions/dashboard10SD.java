package definitions;

import io.cucumber.java.en.And;
import pageobjects.dashboard10Page;

public class dashboard10SD {

    dashboard10Page dashboard10;

    public dashboard10SD() {
        dashboard10 = new dashboard10Page();
    }

    @And("Seleccionar opciones de Top 10 Products with the Highest Scheme Fees")
    public void SeleccionarOpcionesDeTop10ProductswiththeHighestSchemeFees(){
        dashboard10.SeleccionarTop10ProductswiththeHighestSchemeFees();
    }

    @And("Seleccionar opcioens de Top 10 MCCs with the Highest Scheme Fees")
    public void seleccionarOpcioensDeTopMCCsWithTheHighestSchemeFees() {
        dashboard10.seleccionarTopMCCsWithTheHighestSchemeFees();
    }
}
