package definitions;

import io.cucumber.java.en.And;
import pageobjects.dashboard05Page;

public class dashboard05SD {

    dashboard05Page dashboard05;

    public dashboard05SD() {
        dashboard05 = new dashboard05Page();
    }

    @And("Exportar excel de la seccion Growth by Jurisdiction")
    public void exportarExcelSeccionGrowthByJurisdiction(){
        dashboard05.exportarExcelGrowthByJurisdiction();

    }




}
