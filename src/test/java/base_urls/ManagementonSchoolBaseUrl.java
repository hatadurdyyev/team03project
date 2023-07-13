package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

import static utilities.Authentication.generateToken;

public class ManagementonSchoolBaseUrl {

    protected RequestSpecification spec;
    protected static RequestSpecification spec2;

    @Before//This method will run before each @Test methods.
    public void setUp() {

        spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri("https://managementonschools.com/")
                .addHeader("Authorization",""+generateToken())
                .build();

    }
    public static void setSpec2(){


        spec2 = new RequestSpecBuilder().setBaseUri("https://managementonschools.com/app").build();


    }
}
