package stepdefinitions.US_09and23_StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static base_urls.ManagementonSchoolBaseUrl.spec2;

public class ApiViceDeanStepDefs {

    @Given("send get request")
    public void send_get_request() {
        //Set the url
        spec2.pathParams("first", "dean", "second", "getAll");

    }
    @Then("validate body")
    public void validate_body() {

    }

}
