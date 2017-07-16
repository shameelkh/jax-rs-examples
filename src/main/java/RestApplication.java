import javax.ws.rs.ApplicationPath;
        import javax.ws.rs.core.Application;
        import java.util.HashSet;
        import java.util.Set;

@ApplicationPath("/firstjax")
public class RestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> set = new HashSet<Class<?>>();
        set.add(Movies.class);
        return set;
    }
}
