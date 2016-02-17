package jaxrs;

	import javax.inject.Inject;
	import javax.ws.rs.GET;
	import javax.ws.rs.Path;
	import javax.ws.rs.Produces;
	import javax.ws.rs.core.MediaType;
import entities.UserList;
import services.UserService;



	@Path("/users")
	public class UserCRUDService {
		

		@Inject
		private UserService service;
		

	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public UserList getUsers() {
	        UserList users = new UserList();
	        users.setDiscCollection(service.getAllUsers());
	        return users;
	    }



	

}
