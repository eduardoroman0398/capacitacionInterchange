package definitions;

import io.cucumber.java.en.And;
import pageobjects.portalPage;

import java.io.IOException;

public class portalSD {

    portalPage portal;

    public portalSD() {
        portal = new portalPage();
    }

    @And("Seleccionamos el perfil {}")
    public void seleccionamosElPerfil(String perfil) throws InterruptedException {
        portal.seleccionarPerfil(perfil);
    }

    @And("Ingresamos nueva url {}")
    public void ingresamosNuevaUrl(String url) throws InterruptedException, IOException {
        portal.ingresaNuevaUrl(url);
    }
}
