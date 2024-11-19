package definitions;

import io.cucumber.java.en.And;
import pageobjects.dashboard06Page;

public class dashboard06SD {

    dashboard06Page dashboard06;

    public dashboard06SD() {
        dashboard06 = new dashboard06Page();
    }

    @And("Seleccionamos opciones de la seccion Volume by Product Type {}")
    public void SeleccionamosOpcionesDeVolumenByProductType(String productType){
        dashboard06.seleccionarOpcionesDeDashboard06(productType);
    }
}
