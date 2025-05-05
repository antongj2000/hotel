package servicies;

import java.util.List;

import Entities.Restaurant;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

import jakarta.transaction.Transactional;

@ApplicationScoped
public class RestaurantService {

	@Inject
	EntityManager em;

	@Transactional
	public Restaurant createRestaurant(Restaurant r) {
		return em.merge(r);
	}

	@Transactional
	public List<Restaurant> getAllRestaurants() {
		return em.createQuery("SELECT r FROM Restaurant r", Restaurant.class).getResultList();
	}

}
