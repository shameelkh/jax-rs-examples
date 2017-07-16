import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/movies")
public class Movies {

    @GET
    public String getMovies() {
        return "Planet of The Apes, Top Gun, Harry Potter";
    }

    @GET
    @Path("/single")
    public String getMovie() {
        return "King Arthur";
    }

}
