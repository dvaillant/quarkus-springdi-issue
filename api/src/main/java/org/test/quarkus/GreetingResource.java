package org.test.quarkus;

import org.test.service.CdiService;
import service.SpringService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    CdiService cdiService;

    @Inject
    SpringService springService;

    @GET
    @Path("/cdi")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloFromCDI() {
        return cdiService.sayHello();
    }

    @GET
    @Path("/spring")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloFromSpring() {
        return springService.sayHello();
    }

}