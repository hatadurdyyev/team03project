package stepdefinitions.US_02_StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;

import static base_urls.ManagementonSchoolBaseUrl.setSpec;
import static base_urls.ManagementonSchoolBaseUrl.spec2;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class US_02_TC02_API_StepDefs {
    /*
        Given
            https://managementonschools.com/app/guestUser/getAll?page=0&size=1000&sort=name&type=desc
        When
            Admin send a GET request to the URL
        Then
            HTTP Status Code should be 200
        And
            Response content type is “application/json”
        And
            Response body should be like:
                {
                    "id": 1350,
                    "username": "ahmadjan",
                    "ssn": "872-43-2021",
                    "name": "Ahmad",
                    "surname": "Jan",
                    "birthDay": "2004-12-12",
                    "birthPlace": "Kabul",
                    "phoneNumber": "877-354-9873",
                    "gender": "MALE"
                }

        And
            Admin should be able to delete the guest user
        And
            Validate if the guest user is deleted

    */
    Response responseGet;
    Response responseDelete;
    Integer idForDelete;

    @Given("https:\\/\\/managementonschools.com\\/app")
    public void https_managementonschools_com_app() {
        setSpec();
    }
    @When("Admin send a GET request to the URL")
    public void admin_send_a_get_request_to_the_url() {
        //https://managementonschools.com/app/guestUser/getAll?page=0&size=1000&sort=name&type=desc
        spec2.pathParams("first","guestUser","second", "getAll").
                queryParams("page","0", "size", "1000", "sort", "name", "type", "desc");
        responseGet = given(spec2).get("{first}/{second}");
    }
    @Then("HTTP Status Code should be {string}")
    public void http_status_code_should_be(String statusCode) {
        assertEquals(Integer.parseInt(statusCode), responseGet.statusCode());
    }
    @Then("Response content type is {string}")
    public void response_content_type_is(String contentType) {
        assertEquals(contentType, responseGet.contentType());
    }
    @Then("Response body should be received and id is stored")
    public void response_body_should_be_received_and_id_is_stored() {
        //response.prettyPrint();
        JsonPath jsonPath = responseGet.jsonPath();
        List<Integer> idList = jsonPath.getList("content.id");
        idForDelete = idList.get(0);
    }


    @Then("Admin send a DELETE request to the URL")
    public void admin_send_a_delete_request_to_the_url() {
        //https://managementonschools.com/app/guestUser/delete/1353
        spec2.pathParams("first", "guestUser", "second", "delete", "third", idForDelete);
        responseDelete = given(spec2).delete("{first}/{second}/{third}");
    }
    @Then("HTTP Status Code should be {string} after deleting")
    public void http_status_code_should_be_after_deleting(String statusCode) {
        assertEquals(Integer.parseInt(statusCode), responseDelete.statusCode());
    }
    @Then("Body message should be {string}")
    public void body_message_should_be(String message) {
        assertEquals(message, responseDelete.jsonPath().getString("message"));
    }

}
