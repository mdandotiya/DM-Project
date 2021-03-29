package Controller;

import Service.JSONToXML;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.net.URISyntaxException;


@Path("students")
public class templateController {
    JSONToXML jsonToXML = new JSONToXML();

    @POST
    @Path("/login")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response transferTemplate(String json) throws URISyntaxException, IOException {
        Boolean var = jsonToXML.convert(json,"root");
        if(var == false){
            return Response.noContent().build();
        }
        else {
            return Response.ok().entity("converted").build();
        }
    }

}
