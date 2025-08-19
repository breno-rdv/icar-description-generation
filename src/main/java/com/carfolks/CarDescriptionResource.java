
package com.carfolks;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CarDescriptionResource {

    @Inject
    CarDescriptionAgent carDescriptionAgent;

    @POST
    @Path("/generate-description")
    public StructuredAdResponse generateDescription(CarInput carInput) {
        return carDescriptionAgent.generateStructuredAd(carInput);
    }
}
