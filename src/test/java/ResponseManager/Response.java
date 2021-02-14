package ResponseManager;

import Constant.Search;
import RequestManager.Request;
import io.restassured.path.json.JsonPath;
import org.apache.http.HttpStatus;
import static io.restassured.RestAssured.baseURI;

public class Response extends Request {

    String expectedValue = "Harry Potter and the Sorcerer's Stone";
    String imdbId;
    int counter = 0;
    String find = "Search[" + counter + "].Title";


    public String getMovieId(String movieName)
    {
        requestSpecification = requestBySearch(movieName);
        io.restassured.response.Response response = requestSpecification.when().get(baseURI).then().extract().response();
        JsonPath json = response.jsonPath();

        while (!json.getString(find).equals(null)){
            if (json.getString(find).equals(expectedValue) ) {
                imdbId = json.getString("Search[" + counter + "].imdbID");
                break;
            }
            counter++;
            find = "Search[" + counter + "].Title";
        }
        return imdbId;
    }

    public Search searchWithId(String imdbId)
    {
        requestSpecification = requestById(imdbId);
        io.restassured.response.Response response = requestSpecification
                .when().get(baseURI)
                .then().log().all().statusCode(HttpStatus.SC_OK).extract().response();

        return response.jsonPath().getObject("", Search.class);
    }
}
