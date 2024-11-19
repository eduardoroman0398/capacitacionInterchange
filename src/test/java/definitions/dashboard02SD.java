package definitions;

import io.cucumber.java.en.And;
import pageobjects.dashboard02Page;
import support.util;

import java.io.IOException;

public class dashboard02SD {
    dashboard02Page dashboard02;

    public dashboard02SD() {
        dashboard02 = new dashboard02Page();
    }

    @And("Seleccionamos la seccion Interchange Fees Detail")
    public void seleccionamosLaSeccionInterchageFeesDetail() throws InterruptedException, IOException {
        dashboard02.seleccionarInterchangeFeeDetail();
    }

    @And("Seleccionamos la seccion Interchange Fees generated by Jurisdiction {}")
    public void seleccionamosLaSeccionInterchangeFeesgeneratebyJurisdiction(String barJurisdiction) throws InterruptedException, IOException {
        dashboard02.seleccionarIntercangeFeesgeneratedbyJurisdiction(barJurisdiction);
    }


    @And("Seleccionamos la seccion Interchange Fees by Product Type {}")
    public void seleccionamosLaSeccionInterchangeFeesByProductType(String productType) {
        dashboard02.seleccionar_Interchange_Fees_By_ProductType(productType);
    }

    @And("Seleccionamos la seccion Interchange Fees by Program {}")
    public void seleccionamosLaSeccionInterchangeFeesByProgram(String programType) {
        dashboard02.seleccionar_Interchange_Fees_By_Program(programType);
    }
}
