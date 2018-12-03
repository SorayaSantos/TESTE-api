package io.altar.sextafeira;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/exemplos")
public class EndPoint {
	
	@Context
	private UriInfo context;

	@GET
	@Path("healthCheck")
	@Produces(MediaType.TEXT_PLAIN)
	public String healthCheck() {
	    return "URI " + context.getRequestUri().toString() + " is OK!";
	}
	@GET
	@Path("hello/{firstname}")
	@Produces(MediaType.TEXT_PLAIN)
	public String hello(@PathParam("firstname") String name) {
	    return "hello " + name;
	}
	
	private static Map<Long, Car> carMap = new HashMap<Long,Car>();
	static Long id=(long) 1;
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Car createCar(Car car){
		carMap.put(id, car);
		id++;
		return car;
	}
	@GET
	@Path("car/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Car seeCar(@PathParam("id") Long id) {
		return carMap.get(id);
	}
 	
}
