package definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class hooks {
    public static WebDriver driver;

    @Before
    public static void setUp(){
      System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();//maximizar pantalla
    }

    @After
    public static void tearDown(){
       driver.manage().deleteAllCookies();
       driver.close();
   }

    public static String QA_URL = "https://incontrolqa.intelica.com/login/es";

    public static String Interchange_URL = "https://incontrolqa.intelica.com/interchange-dashboard/internal";
    public  static String UAT_URL = "https://uat.intelica.com/login/es";
    public static String Interchange_URL_UAT = "https://uat.intelica.com/interchange-dashboard/internal";

}
