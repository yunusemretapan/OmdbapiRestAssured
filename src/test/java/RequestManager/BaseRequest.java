package RequestManager;

import io.restassured.RestAssured;
import org.junit.After;
import org.junit.Before;

public class BaseRequest {

    String apiKey;

    @Before
    public void setUp() throws Exception
    {
        initialize();
    }

    public void initialize() throws Exception
    {
        RestAssured.baseURI = "http://www.omdbapi.com/";
        apiKey = "88489135";
    }

    @After
    public void tearDown()
    {
    }
}
