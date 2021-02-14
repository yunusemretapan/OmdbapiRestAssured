package RequestManager;

import io.restassured.RestAssured;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class BaseRequest {

    String apiKey;

    @BeforeTest
    public void setUp() throws Exception
    {
        initialize();
    }

    public void initialize() throws Exception
    {
        RestAssured.baseURI = "http://www.omdbapi.com/";
        apiKey = "88489135";
    }

    @AfterTest
    public void tearDown()
    {
    }
}
