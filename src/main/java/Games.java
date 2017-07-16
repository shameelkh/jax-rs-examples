import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/games")
public class Games {

    @GET
    public String getGame() {
        return "Starcraft";
    }
}
