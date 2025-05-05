package resources;

import Entities.Restaurant;
import jakarta.enterprise.context.Dependent;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import servicies.RestaurantService;
import jakarta.ws.rs.*;
import jakarta.inject.Inject;

//@Path("/restaurant")
//@Consumes(MediaType.APPLICATION_JSON) // Accepts JSON input
//@Produces(MediaType.APPLICATION_JSON)
public class RestaurantResources {

	@Inject
	RestaurantService rs;
//
//	@POST
//	@Path("/add")
//	public Restaurant add(Restaurant r) {
//		return rs.createRestaurant(r);
//	}

	

}
