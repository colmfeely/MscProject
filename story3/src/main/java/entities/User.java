package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="Users")
public class User implements Serializable{
		
		// add an attribute specifying a column for the id property
		// add attributes to ensure that the id column is automatically generated
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;

		// add attributes for all the remaining properties
		@Column(name="username") private String username;
		@Column(name="password") private String password;
		@Column(name="usertype") private String usertype;

		public User() {}

		public User(String username, String password, String usertype){
			this.username = username;
			this.password = password;
			this.usertype = usertype;		    
		  }

		public void setId(int id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getUsertype() {
			return usertype;
		}

		public void setUsertype(String usertype) {
			this.usertype = usertype;
		}

		public int getId() {
			return id;
		}

}
