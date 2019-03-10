package online.blackwidow.thorntaildemo.rest.resource;

import online.blackwidow.thorntaildemo.cdi.TestCDI;
import online.blackwidow.thorntaildemo.ejb.TestEJB;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test")
public class TestResource {

    @EJB
    private TestEJB testEJB;
    @Inject
    private TestCDI testCDI;


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/ejb")
    public Response getEJBTestMessage() {
        return Response.ok(testEJB.getMessage()).build();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/cdi")
    public Response getCDITestMessage() {
        return Response.ok(testCDI.getMessage()).build();
    }
}
