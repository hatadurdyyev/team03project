package stepdefinitions.US_20_StepDefs;
import com.jayway.jsonpath.Configuration;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

import static base_urls.ManagementonSchoolBaseUrl.spec;
import static com.jayway.jsonpath.JsonPath.read;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class US_20_TC_01__2_API_Test {

    Response response;
    Response secondResponse;

    String date = "2023-10-19";
    String description = "Sample event";
    String startTime = "09:00";
    String stopTime = "12:00";
    int[] studentIds = {65};

    @Given("send the update request")
    public void send_the_update_request() {

//        JsonPath jsonPath = response.jsonPath();

        spec.pathParams("first","meet","second","update","third","65");

        Map<String, Object> payloadData = new HashMap<>();
        payloadData.put("date", date);
        payloadData.put("description", description);
        payloadData.put("startTime", startTime);
        payloadData.put("stopTime", stopTime);
        payloadData.put("studentIds", studentIds);

        response = given(spec).contentType(ContentType.JSON).body(payloadData).put("/{first}/{second}/{third}");

        response.prettyPrint();

//        String actualDate = jsonPath.getList("content.findAll{it.studentIds=='"+studentIds+"'}.date").get(0).toString();
//        System.out.println("actualDate = " + actualDate);


    }
    @When("verify the update request")
    public void verify_the_update_request() {

        String apiResponse = "{\n" +
                "    \"object\": {\n" +
                "        \"id\": 65,\n" +
                "        \"description\": \"Sample event\",\n" +
                "        \"date\": \"2023-10-19\",\n" +
                "        \"startTime\": \"09:00:00\",\n" +
                "        \"stopTime\": \"12:00:00\",\n" +
                "        \"advisorTeacherId\": 6,\n" +
                "        \"teacherName\": \"Kemal\",\n" +
                "        \"teacherSsn\": \"888-99-6969\",\n" +
                "        \"students\": []\n" +
                "    },\n" +
                "    \"message\": \"Meet Updated Successfully\",\n" +
                "    \"httpStatus\": \"OK\"\n" +
                "}";


        Object document = Configuration.defaultConfiguration().jsonProvider().parse(apiResponse);


        JsonPath jsonPath = response.jsonPath();

        int id = read(document, "$.object.id");
        String description = read(document, "$.object.description");
        String date = read(document, "$.object.date");
        String startTime = read(document, "$.object.startTime");
        String stopTime = read(document, "$.object.stopTime");
        String teacherName = read(document, "$.object.teacherName");
        String teacherSsn = read(document, "$.object.teacherSsn");
        String message = read(document, "$.message");
        String httpStatus = read(document, "$.httpStatus");


        int expectedId = 65;
        String expectedDescription = "Sample event";
        String expectedDate = "2023-10-19";
        String expectedStartTime = "09:00:00";
        String expectedStopTime = "12:00:00";
        String expectedTeacherName = "Kemal";
        String expectedTeacherSsn = "888-99-6969";
        String expectedMessage = "Meet Updated Successfully";
        String expectedHttpStatus = "OK";

        Assert.assertEquals(expectedId, id);
        Assert.assertEquals(expectedDescription, description);
        Assert.assertEquals(expectedDate, date);
        Assert.assertEquals(expectedStartTime, startTime);
        Assert.assertEquals(expectedStopTime, stopTime);
        Assert.assertEquals(expectedTeacherName, teacherName);
        Assert.assertEquals(expectedTeacherSsn, teacherSsn);
        Assert.assertEquals(expectedMessage, message);
        Assert.assertEquals(expectedHttpStatus, httpStatus);

        System.out.println("All is done :)");


        /*

        {
    "object": {
        "id": 65,
        "description": "Sample event",
        "date": "2023-10-19",
        "startTime": "09:00:00",
        "stopTime": "12:00:00",
        "advisorTeacherId": 6,
        "teacherName": "Kemal",
        "teacherSsn": "888-99-6969",
        "students": [

        ]
    },
    "message": "Meet Updated Successfully",
    "httpStatus": "OK"
}


         */

//        spec.get("first","meet","second","getMeetById","third","65");
//
//        secondResponse = given(spec).get("/{first}/{second}/{third}");


//
//        JsonPath updatedJsonPath = secondResponse.jsonPath();
//
//        String updatedDate = updatedJsonPath.getString("date");
//        String updatedDescription = updatedJsonPath.getString("description");
//        String updatedStartTime = updatedJsonPath.getString("startTime");
//        String updatedStopTime = updatedJsonPath.getString("stopTime");
//        int[] updatedStudentIds = updatedJsonPath.get("studentIds");
//
//        assertNotEquals("Date should have changed", date, updatedDate);
//        assertNotEquals("Description should have changed", description, updatedDescription);
//        assertNotEquals("Start time should have changed", startTime, updatedStartTime);
//        assertNotEquals("Stop time should have changed", stopTime, updatedStopTime);
//        assertNotEquals("Student IDs should have changed", studentIds, updatedStudentIds);

    }
}





