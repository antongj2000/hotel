package Repository;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import Entities.Hotel;

@Dependent
public class HotelRepository {

	@Inject
	private EntityManager em;

	@Transactional
	public Hotel createH(Hotel h) {

		return em.merge(h);
	}
}