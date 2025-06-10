package Repository;

import java.util.List;

import Entities.Restaurant;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

import jakarta.transaction.Transactional;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import jakarta.ws.rs.core.MediaType;

@Dependent
public class RestaurantRepository {

	@Inject
	EntityManager em;

	
	@Transactional
	public Restaurant addRestaurant(Restaurant rp) {
		return em.merge(rp);
	}

	@Transactional
	public List<Restaurant> getAllRestaurants() {
		return em.createQuery("SELECT r FROM Restaurant r", Restaurant.class).getResultList();
	}

}
