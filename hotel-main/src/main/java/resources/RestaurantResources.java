package resources;

import Entities.Restaurant;
import Repository.RestaurantRepository;

import jakarta.enterprise.context.Dependent;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.*;
import jakarta.inject.Inject;

@Path("/restaurant")
@Consumes(MediaType.APPLICATION_JSON) // Accepts JSON input
@Produces(MediaType.APPLICATION_JSON)
public class RestaurantResources {

	@Inject
	RestaurantRepository rp;

	@GET
	@Path("/get")
	public String getRestaurants() {
		return rp.getAllRestaurants().toString();
	}
	
	@POST
	@Path("/addRestaurant")
	public Response createRestaurant(Restaurant r) {
		Restaurant re = rp.addRestaurant(r);

		return Response.ok().entity(re).build();
	}
}
