package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.loginPage;

import java.io.IOException;
import java.util.Objects;

import static definitions.hooks.QA_URL;
import static support.util.evidencias;

public class loginSD {

    loginPage login;

    public loginSD() {
        login = new loginPage();
    }

    @Given("Ingresar la url de la pagina {string}")
    public void ingresarLaUrlDeLaPagina(String ambiente) throws IOException, InterruptedException {
        login.ingresarAlAmbiente(ambiente);
    }

    @When("Ingresamos credenciales {string}, {string}")
    public void ingresamosCredenciales(String usuario, String contrasena) throws InterruptedException {
        login.ingresarCredenciales(usuario, contrasena);
    }

    @And("Seleccionamos Generate Token")
    public void seleccionamosGenerateToken(){
        login.clickBotonGenerateToken();
    }

    @Then("Verificamos el inicio de sesion correcto {string}")
    public void verificamosElInicioDeSesionCorrecto(String textoEsperado) {
        login.verificarInicioDeSesion(textoEsperado);
    }


}
