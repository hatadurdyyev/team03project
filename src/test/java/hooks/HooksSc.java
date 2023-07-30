package hooks;

import io.cucumber.java.Before;

import static base_urls.ManagementonSchoolBaseUrl.setSpec;

public class HooksSc {

    @Before
    public void beforeApi(){
        setSpec();
    }
}
