package Repository;

import Entities.Employee;
import Entities.Restaurant;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Dependent
public class EmployeeRepository {
	
	@Inject
	private EntityManager em;

	@Transactional
	public Employee addEmployee(String name, long resId) {
		Restaurant res = em.find(Restaurant.class, resId);
        if (res == null) {
            throw new IllegalArgumentException("Restaurant with ID " + resId + " not found");
        }

        Employee e = new Employee();
        e.setName(name);
        e.setRes(res);
        em.persist(e);
        return e;
	}
}
