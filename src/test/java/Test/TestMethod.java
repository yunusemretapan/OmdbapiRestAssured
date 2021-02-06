package Test;

import ResponseManager.Response;
import org.junit.Test;

public class TestMethod extends Response {

    String movieName = "Harry Potter";

    @Test
    public void testMovieDetails()
    {
        String filmId = getMovieId(movieName);
        searchWithId(filmId);
    }
}
