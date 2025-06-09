package resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import Entities.Employee;
import Repository.EmployeeRepository;

@Path("/Employee/")
public class EmployeeResources {

	@Inject
	private EmployeeRepository EmployeeRepository;

	@POST
	@Path("/empAdd")
	public Employee addEmployee(@QueryParam("name") String name, @QueryParam("resId") Long resId) {
		return EmployeeRepository.addEmployee(name, resId);
	}

}