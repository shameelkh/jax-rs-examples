# Simple Webservice Using JAX-RS

## Main Files

### pom.xml
Dependency on Jersey (The reference implementation for JAX-RS)
```
<dependencies>
    <dependency>
        <groupId>com.sun.jersey</groupId>
        <artifactId>jersey-bundle</artifactId>
        <version>1.19.4</version>
    </dependency>
</dependencies>
```

### RestApplication
A class that extends `Application` (javax.ws.rs.core.Application), and overrides the `getClasses()` method <br/>

```
@ApplicationPath("/firstjax")
public class RestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> set = new HashSet<Class<?>>();
        set.add(Movies.class);
        set.add(Games.class);
        return set;
    }
}
```
`Movies` and `Games` are resources that need to be added to the Application.

### Resources
An example resource (Movies.java):
```
@Path("/movies")
public class Movies {
    @GET
    @Path("/single")
    public String getMovie() {
        return "King Arthur";
    }
}

```
Webservices provide 'resources'. These resource classes expose controller methods which are requested by the client.
Annotations such as `GET` and `POST`, `Path`, are used to implement `CRUD` level access of these resources
<br/><br/>

The Movies resource can be accessed through `http://localhost:8080/SimpleJAXRS/firstjax/movies/single` where `SimpleJAXRS` is the 
war package name (`SimpleJAXRS.war`), and `firstJax` is path defined above the application class.

