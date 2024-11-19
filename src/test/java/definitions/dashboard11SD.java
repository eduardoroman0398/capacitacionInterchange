package definitions;

import io.cucumber.java.en.And;
import pageobjects.dashboard11Page;

public class dashboard11SD {

    dashboard11Page dashboard11;

    public dashboard11SD() {
        dashboard11 = new dashboard11Page();
    }

    @And("Seleccionar exportar excel de Growth By Jurisdiction")
    public void SeleccionarexportarexceldeGrowthByJurisdiction(){
        dashboard11.ExportarexceldeGrowthByJurisdiction();
    }

    @And("Seleccionar opciones de Growth by Product Type")
    public void seleccionarOpcionesDeGrowthByProductType() {
        dashboard11.seleccionarViewMoreGrowthByProductType();
    }

    @And("Seleccionar opciones de Growth for Top 5 MCCs")
    public void seleccionarOpcionesDeGrowthForTopMCCs() {
        dashboard11.seleccionarViewMoreGrowthForTopMCCs();
    }
}
