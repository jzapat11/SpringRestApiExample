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
		user.setName("Name 1");
		user.setLastName("Lastname 1");
		user.setPhone("111111");
		user.setAddress("Address 1");
		userList.add(user);

		user = new User();
		user.setName("Name 2");
		user.setLastName("Lastname 2");
		user.setPhone("22222");
		user.setAddress("Address 2");
		userList.add(user);

		user = new User();
		user.setName("Name 3");
		user.setLastName("Lastname 3");
		user.setPhone("33333");
		user.setAddress("Address 3");
		userList.add(user);

		user = new User();
		user.setName("Name 4");
		user.setLastName("Lastname 4");
		user.setPhone("444444");
		user.setAddress("Address 4");
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
