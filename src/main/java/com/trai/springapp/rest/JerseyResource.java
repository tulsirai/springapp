/*
 * http://javapapers.com/web-service/restful-services-http-basic-authentication/ * 
 * 
 */
package com.trai.springapp.rest;

import com.trai.springapp.model.Comment;
import com.trai.springapp.model.User;
import com.trai.springapp.service.CommentService;
import com.trai.springapp.service.GreetingService;
import com.trai.springapp.service.UserService;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
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
    
    @Inject
    private UserService userService;
    
    @Inject
    private CommentService commentService;
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
    
    @GET
    @Path("/comment")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Comment> getComments(){
//        GenericEntity<List<Comment>> comments = new GenericEntity<List<Comment>>(commentService.getComments()){};        
//        return (Response.ok(comments).build());
//        commentService.getComments().forEach(System.out::println);
        return (commentService.getComments());
    }
    
    @POST
    @Path("/postcomment")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public Comment postMessage(String msg){
        System.out.println(msg);
        return (new Comment("Hello", "Successful"));
    }
    
    @POST
    @Path("/info")
    public Response resonseMsg(@FormParam("fname") String fname, @FormParam("lname") String lname){
        String output = "This all the info about " + fname + " " + lname;
        User user = new User();
        user.setUsername(fname);
        user.setPassword(lname);
        user.setEmail("noahrai@gmail.com");
        userService.saveOrUpdate(user);
        return Response.status(Response.Status.OK).entity(output).build();
    }
    
    @POST
    @Path("/multiValueInfo")
    public Response resonseMsgWithMultiValueForm(MultivaluedMap<String, String> params){
        final String output = " Form parameters :\n";
        return null;
    }
}
