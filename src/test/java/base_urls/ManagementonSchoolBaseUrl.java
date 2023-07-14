package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

import static utilities.Authentication.generateToken;
import static utilities.Authentication.generateToken3;

public class ManagementonSchoolBaseUrl {

    protected RequestSpecification spec;
    public static RequestSpecification spec2;

    @Before//This method will run before each @Test methods.
    public void setUp() {

        spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri("https://managementonschools.com/")
                .addHeader("Authorization",""+generateToken())
                .build();

    }

    public static void setSpec(){
        spec2 = new RequestSpecBuilder()
                .addHeader("Authorization", generateToken3())
                .setBaseUri("https://managementonschools.com/app").build();
    }

}
