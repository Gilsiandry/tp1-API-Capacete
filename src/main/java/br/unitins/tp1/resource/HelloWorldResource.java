package br.unitins.tp1.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class HelloWorldResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() { 
        return  "Hello World!";
    }

}