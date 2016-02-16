package jaxrs;

	import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



import services.UserService;
import entities.User;
import entities.UserList;



	@Path("/users")
	public class UserCRUDService {
		

		@Inject
		private UserService service;
		

	    @GET
	    @Path("/all")
	    @Produces(MediaType.APPLICATION_JSON)
	    public UserList getUsers() {
	        UserList users = new UserList();
	        users.setDiscCollection(service.getAllUsers());
	        return users;
	    }
	    

		@POST
		@Path("/add")
		@Consumes(MediaType.APPLICATION_JSON)
		public void addCompactDisc(User user) {
			user.setId(0); // make sure the ID is not set
			service.addToUsers(user);
		}
	    
	    
	  



	

}
