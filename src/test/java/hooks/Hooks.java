package hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

<<<<<<< HEAD
import static base_urls.ManagementonSchoolBaseUrl.setSpec;
=======
import static base_urls.ManagementonSchoolBaseUrl.*;
>>>>>>> main

public class Hooks {
    /*
  HOOKS : is used to run BEFORE or AFTER each SCENARIO or SCENARIO OUTLINE
   */
    @Before()
    public void setUpScenario(){
<<<<<<< HEAD
        //  RUNS BEFORE EACH SCENARIO
        System.out.println("BEFORE METHODS");
        setSpec();
=======
      //  RUNS BEFORE EACH SCENARIO
       System.out.println("BEFORE METHODS");
       setSpec();
>>>>>>> main

    }

    @Before
    public void setUp(){setSpec();}

    @After
    public void tearDown(Scenario scenario){
//        AFTER EACH SCENARIO
        System.out.println("AFTER METHOD");

        if (scenario.isFailed()) { // attach the report only if a scenario fails
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","screenshots");
            Driver.closeDriver();
        }
    }
}
