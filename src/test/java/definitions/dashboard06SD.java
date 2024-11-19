package definitions;

import io.cucumber.java.en.And;
import pageobjects.dashboard06Page;

import java.io.IOException;

public class dashboard06SD {

    dashboard06Page dashboard06;

    public dashboard06SD() {
        dashboard06 = new dashboard06Page();
    }

    @And("Seleccionamos opciones de la seccion Volume by Product Type {}")
    public void SeleccionamosOpcionesDeVolumenByProductType(String productType) throws IOException, InterruptedException {
        dashboard06.seleccionarOpcionesDeDashboard06(productType);
    }
}
