package services;


	import java.util.Collection;

	import javax.ejb.EJB;
	import javax.ejb.Local;
	import javax.ejb.Remote;
	import javax.ejb.Stateless;
	import javax.ejb.TransactionAttribute;
	import javax.ejb.TransactionAttributeType;
	import javax.inject.Inject;
	import javax.jws.WebService;

import dao.UserDAO;
import entities.User;
	@Stateless
	@Local
	@TransactionAttribute (TransactionAttributeType.REQUIRED)
	public class UserServiceEJB implements UserService {
		
			
		@EJB // uses reflection
		private UserDAO dao;
		
//		@Resource
//		private SessionContext context;

		public void setDao(UserDAO dao) {
			// do something really important on injection
			this.dao = dao;
		}



		public Collection<User> getAllUsers() {
			return dao.getAllUsers();
		}


		public void addToUsers(User user) {
			dao.addUser(user);
			
		}
	

}
