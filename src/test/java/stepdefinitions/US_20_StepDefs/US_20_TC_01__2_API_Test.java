package stepdefinitions.US_20_StepDefs;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static base_urls.ManagementonSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;

public class US_20_TC_01__2_API_Test {

    Response response;

    String date = "2023-10-19";
    String description = "Sample event";
    String startTime = "09:00";
    String stopTime = "12:00";
    int[] studentIds = {65};

    @Given("send the update request")
    public void send_the_update_request() {

        spec.pathParams("first","meet","second","update","third","65");

        Map<String, Object> payloadData = new HashMap<>();
        payloadData.put("date", date);
        payloadData.put("description", description);
        payloadData.put("startTime", startTime);
        payloadData.put("stopTime", stopTime);
        payloadData.put("studentIds", studentIds);

        response = given(spec).contentType(ContentType.JSON).body(payloadData).put("/{first}/{second}/{third}");

        response.prettyPrint();

    }
    @When("verify the update request")
    public void verify_the_update_request() {

        response.then().statusCode(200);

    }

}
