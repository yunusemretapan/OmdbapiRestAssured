package Test;

import Constant.Search;
import ResponseManager.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMethod extends Response {

    String movieName = "Harry Potter";

    @Test
    public void testMovieDetails()
    {
        String filmId = getMovieId(movieName);
        Search search = searchWithId(filmId);
        Assert.assertEquals("2001",search.year);
        Assert.assertEquals("Harry Potter and the Sorcerer's Stone",search.title);
        Assert.assertEquals("16 Nov 2001",search.released);
    }
}
