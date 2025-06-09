package resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import Entities.Hotel;
import Repository.HotelRepository;

@Path("/Hotel/")
public class HotelResource {

	@Inject
	private HotelRepository HRepository;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("createHotel")
	public Response createSC(Hotel h) {
		Hotel ht = HRepository.createH(h);
		return Response.ok().entity(ht).build();
	}

	

}