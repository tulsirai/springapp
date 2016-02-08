/*
 * http://javapapers.com/web-service/restful-services-http-basic-authentication/
 * 
 * 
 */
package com.trai.springapp.resource;

import com.trai.springapp.service.GreetingService;
import java.util.Date;
import javax.inject.Inject;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

/**
 *Root Resource Class - a POJO annotated with @Path, have at least one method
 * annotated with @Path or a resource method designator annotation such as
 * @GET, @PUT, @POST, @DELETE
 * 
 * @Path annotation's value is a relative URI path as /hello in the simplest form.
 * YOu can embed variablesin the URIs
 *  @Path ("users/{username}"
 * 
 *  Use @PathParam on method to extract of variable in @Path
 * 
 * @author trai
 */
@Path("hello")
public class JerseyResource {
    
    @Inject
    private GreetingService greetingService;
    
    /*
    * @Produces annotation is used to specify the MIME media types of 
    * representation a resource can produce and send back to the client.
    *
    * @Produces annoation can be applied at both the class level and method levels.
    * @Produces applied at the method will override the class level.
    *
    * A resource class can produce more than one MIME media type.
    * The ACCEPT header of HTTP request of the client declares what is the most acceptable MIME.
    *  Accept: text/plain;q=0.9, text/html
    */
    @GET
    @Path("/{name}")
    @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON})
    public String getHello(@PathParam("name") String name){
        return (String.format("%s:, %S", new Date(), greetingService.greet(name)));
    }
    
    @POST
    @Path("/info")
    public Response resonseMsg(@FormParam("fname") String fname, @FormParam("lname") String lname){
        String output = "This all the info about " + fname + " " + lname;
        return Response.status(Response.Status.OK).entity(output).build();
    }
    
    @POST
    @Path("/multiValueInfo")
    public Response resonseMsgWithMultiValueForm(MultivaluedMap<String, String> params){
        final String output = " Form parameters :\n";
       // params.
        return null;
    }
}
