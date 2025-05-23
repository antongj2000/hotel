package servicies;

import java.util.List;

import Entities.Restaurant;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@ApplicationScoped
@Path("/service")
public class RestaurantService {

	@Inject
	EntityManager em;

	@Inject
     Restaurant r;
	
	
	@POST
	@Path("/addRestaurant")
	@Transactional
	@Produces(MediaType.TEXT_PLAIN)
	public String hello(@QueryParam("name") String name) {
		Restaurant r = new Restaurant();
		r.setName(name);
		r.persist();
		return "Hello " + name;
	}

	@Transactional
	public List<Restaurant> getAllRestaurants() {
		return em.createQuery("SELECT r FROM Restaurant r", Restaurant.class).getResultList();
	}

}
