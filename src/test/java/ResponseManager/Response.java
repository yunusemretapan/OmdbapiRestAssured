package ResponseManager;

import RequestManager.Request;
import io.restassured.path.json.JsonPath;
import org.apache.http.HttpStatus;


import static io.restassured.RestAssured.baseURI;
import static org.hamcrest.CoreMatchers.equalTo;

public class Response extends Request {

    String expectedValue = "Harry Potter and the Sorcerer's Stone";
    String imdbId;
    String find = "";
    int counter = 0;

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

    public void searchWithId(String imdbId)
    {
        requestSpecification = requestById(imdbId);
        requestSpecification.when().get(baseURI).then().log().all()
                .statusCode(HttpStatus.SC_OK).and()
                .body("Title", equalTo("Harry Potter and the Sorcerer's Stone")).and()
                .body("Year",equalTo("2001")).and()
                .body("Released",equalTo("16 Nov 2001"));
    }
}
