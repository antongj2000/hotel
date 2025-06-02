package restclient;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import Client.HolidayResponse;

import java.util.List;

@Path("/v3")
@RegisterRestClient(configKey = "holiday-api")
public interface HolidayClient {

    @GET
    @Path("/publicholidays/{year}/{countryCode}")
    List<HolidayResponse> getHolidays(@PathParam("year") int year, @PathParam("countryCode") String countryCode);
}