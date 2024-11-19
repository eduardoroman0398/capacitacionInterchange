package definitions;

import io.cucumber.java.en.Then;
import pageobjects.dashboard02Page;
import pageobjects.dashboard03Page;

public class dashboard03SD {

    dashboard03Page dashboard03;

    public dashboard03SD() {
        dashboard03 = new dashboard03Page();
    }

    @Then("Los nombres deben incluir el MCC {}")
    public void validarNombresdeMCC(String mccName) throws InterruptedException {
        dashboard03.validar_Nombres_de_MCC(mccName);
    }
}
