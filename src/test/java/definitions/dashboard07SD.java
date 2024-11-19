package definitions;

import io.cucumber.java.en.And;
import pageobjects.dashboard07Page;

import java.io.IOException;

public class dashboard07SD {

    dashboard07Page dashboard07;

    public dashboard07SD() {
        dashboard07 = new dashboard07Page();
    }

    @And("Exportar excel de Growth By Jurisdiction")
    public void ExportarExcelDeGrowthByJurisdiction() throws IOException, InterruptedException {
        dashboard07.exportarExcelDeLaSeccionGrowthByJurisdiction();
    }
}
