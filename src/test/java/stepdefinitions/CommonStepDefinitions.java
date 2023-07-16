package stepdefinitions;

import io.cucumber.java.en.Then;
import utilities.Driver;

public class CommonStepDefinitions {
    // GooglePage googlePage = new GooglePage();

    @Then("close the application")
    public void close_the_application() {

        Driver.closeDriver();

    }
}
