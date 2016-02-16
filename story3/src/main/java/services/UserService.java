package services;

import java.util.Collection;

import javax.ejb.Local;

import entities.User;

@Local
public interface UserService {
	
	public Collection<User> getAllUsers() ;
	public void addToUsers(User user);

}
