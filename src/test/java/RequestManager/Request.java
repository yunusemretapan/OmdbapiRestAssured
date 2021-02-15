package RequestManager;

import io.restassured.specification.RequestSpecification;
import Constant.Data;
import static io.restassured.RestAssured.given;

public class Request extends BaseRequest {

    public RequestSpecification requestSpecification;

    public RequestSpecification requestBySearch(String movieName)
    {
        requestSpecification = given().
                param(Data.API_KEY.getData(), apiKey).
                param(Data.FILM_NAME.getData(), movieName).
                param(Data.PAGE.getData(), "1").
                param(Data.TYPE.getData(), "movie").
                param(Data.YEAR.getData(), "").
                param(Data.DATA_TYPE.getData(), "json").
                param(Data.CALLBACK.getData(), "").
                param(Data.API_VERSION.getData(), "1");
        return requestSpecification;
    }

    public RequestSpecification requestById(String id)
    {
        requestSpecification = given().
                param(Data.API_KEY.getData(), apiKey).
                param(Data.ID.getData(), id).
                param(Data.TITLE.getData(), "").
                param(Data.PLOT.getData(), "short").
                param(Data.TYPE.getData(), "movie").
                param(Data.YEAR.getData(), "").
                param(Data.DATA_TYPE.getData(), "json").
                param(Data.CALLBACK.getData(), "").
                param(Data.API_VERSION.getData(), "1");
        return requestSpecification;
    }

    public RequestSpecification requestLord(String movieName, String year)
    {
        requestSpecification = given().
                param(Data.API_KEY.getData(), apiKey).
                param(Data.TITLE.getData(), movieName).
                param(Data.YEAR.getData(), year);
        return requestSpecification;
    }
}
