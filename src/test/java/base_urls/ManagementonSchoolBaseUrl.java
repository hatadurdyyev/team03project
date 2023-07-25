package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

import static utilities.Authentication.*;

public class ManagementonSchoolBaseUrl {

    public static RequestSpecification spec;
    public static RequestSpecification spec2;

    //This method will run before each @Test methods.
    public void setUp() {

        spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri("https://managementonschools.com/")
                .addHeader("Authorization",""+generateToken3())
                .build();

    }

    public static void setSpec(){
        spec2 = new RequestSpecBuilder()
                .addHeader("Authorization", generateToken3())
                .setBaseUri("https://managementonschools.com/app").build();
    }

    public static void setSpec2(){

        spec2 = new RequestSpecBuilder().setBaseUri("https://managementonschools.com/app").build();
    }

}





