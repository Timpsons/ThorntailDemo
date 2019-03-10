package online.blackwidow.thorntaildemo.rest.resource;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
@ApplicationScoped
public class HelloWorldEndpoint {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getHelloMessage() {
        return Response.ok("Hello from Thorntail!").build();
    }
}
