package dao.jpa;


	import java.util.Collection;
	import java.util.List;

	import javax.ejb.Local;
	import javax.ejb.Stateless;
	import javax.persistence.EntityManager;
	import javax.persistence.PersistenceContext;
	import javax.persistence.Query;

	import dao.UserDAO;
	import entities.User;


	@Stateless
	@Local
	public class JPAUserDAO implements UserDAO {

		@PersistenceContext
		private EntityManager em;
		
		public void addUser(User user) {

			Query query = em.createQuery("from Users");
			List<User> users = query.getResultList(); 
			if (!users.contains(user))
				em.persist(user);
			
		}


		public User getUserById(int id) {


			// TODO Auto-generated method stub		
			Query query  = em.createQuery("from Users user where user.id = :id");
			query.setParameter("id", id);
			// remember we are assuming only one album has any particular title
			// could have used getSingleResult() but this an exception if there is more than one result
			List<User> result = query.getResultList();
			return result.get(0);
		}


		public Collection<User> getUserByType(String usertype) {

			Query query  = em.createQuery("from Users user where user.usertype = :usertype");
			query.setParameter("usertype", usertype);
			
			List<User> result = query.getResultList();
			return result;
		}


		public Collection<User> getAllUsers() {

			Query query = em.createQuery("from User");
			List<User> users = query.getResultList(); 
			return users;
		}
}
