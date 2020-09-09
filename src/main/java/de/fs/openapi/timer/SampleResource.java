package de.fs.openapi.timer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("sample")
public class SampleResource {

    @GET
    public Response doit() {
        return Response.ok("It works! " + System.currentTimeMillis()).build();
    }
}
