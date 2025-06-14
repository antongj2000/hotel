package Repository;

import Entities.Hotel;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Dependent
public class HotelRepository {

	@Inject
	private EntityManager em;

	@Transactional
	public Hotel createH(Hotel s) {

		return em.merge(s);
	}
}