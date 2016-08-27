package co.com.spring.rest.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.spring.rest.api.model.User;

@RestController
public class UserRestController {

	@RequestMapping(value = "/user/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<User>> getUsers() {

		List<User> userList = new ArrayList<User>();
		User user = new User();
		user.setName("Juan");
		user.setLastName("Zapata");
		user.setPhone("2345677");
		user.setAddress("Cll 107 Sur # 50 - 99");
		userList.add(user);

		user = new User();
		user.setName("Lina");
		user.setLastName("Parra");
		user.setPhone("64565445");
		user.setAddress("Cll 107 Sur # 50 - 99");
		userList.add(user);

		user = new User();
		user.setName("Daniel");
		user.setLastName("Zapata");
		user.setPhone("6668");
		user.setAddress("Cra 87A #  32 C - 25");
		userList.add(user);

		user = new User();
		user.setName("Miryam");
		user.setLastName("Calle");
		user.setPhone("7373737");
		user.setAddress("Cra 1 # 3 - 4");
		userList.add(user);

		return new ResponseEntity<List<User>>(userList, HttpStatus.OK);

	}

	@RequestMapping(value="/user/{id}", method = RequestMethod.GET)
	public ResponseEntity<User> getUser(@PathVariable("id") int id) {
		
		User user = new User();
		user.setId(String.valueOf(id));
		user.setName("Juan");
		user.setLastName("Zapata");
		user.setAddress("Cll 2323 # 454 Sur");
		user.setPhone("23232323");
		
		return new ResponseEntity<User>(user, HttpStatus.OK);
		
		
	}

	
	@RequestMapping(value = "/user/", method = RequestMethod.POST)
	public ResponseEntity<Void> createUser(@RequestBody User user) {
		
		//TODO: Procedure to create user here
		System.out.println("Inserting user.....");
		System.out.println("Id: " + user.getId());
		System.out.println("Name: " + user.getName());
		System.out.println("LastName: " + user.getLastName());
		System.out.println("Address: " + user.getAddress());
		System.out.println("Phone: " + user.getPhone());
		
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
	
	@RequestMapping(value = "/user/", method=RequestMethod.PUT)
	public ResponseEntity<Void> updateUser(@RequestBody User user) {
		
		//TODO: Procedure to update user here
		System.out.println("Updating user.....");
		System.out.println("Id: " + user.getId());
		System.out.println("Name: " + user.getName());
		System.out.println("LastName: " + user.getLastName());
		System.out.println("Address: " + user.getAddress());
		System.out.println("Phone: " + user.getPhone());
		
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteUser(@PathVariable("id") int id){
		
		//TODO: Procedure to delete user here
		System.out.println("Deleting user.....");		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
}
