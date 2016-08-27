# Spring Rest API Example. 

This project is intended to be and example of a Restful API using Spring Rest Controllers.

# Prerequisites.

1.	Maven 3.3.+
2. Java ( JDK 1.7.+ )
3. Tomcat 7.0.+
	
# How to test the app 

1. Please clone this repo to your local.
2. Build the app by typing `mvn clean install` commmand.
3. Get the War artifact from your `targer` directory within your parent project forlder.
3. Copy the EAR into `webapps` folder in you local tomcat instance.
4. Start your tomcat instance. 
5. Open your favorite REST client program and send the following request to test the CRUD functionalities included into the app.
	-	List of Users (HTTP Method: GET) -> http://localhost:8080/SpringRestApiExample/user/
	-	Retrive on user (HTTP Method: GET) -> http://localhost:8080/SpringRestApiExample/user/1
	-	Create one user (HTTP Method: POST) -> http://localhost:8080/SpringRestApiExample/user/
		Request Body:
		```
		{
		    "id" : "2",
		    "name" : "SomeName",
		    "lastName" : "SomeLastName",
		    "phone" : "AnyPhoneNumber",
		    "address" : "AnyAddress"
		}
		```	
	-	Update a user (HTTP Method: PUT) -> http://localhost:8080/SpringRestApiExample/user/
		Request Body:
		```
		{
		    "id" : "2",
		    "name" : "SomeName",
		    "lastName" : "SomeLastName",
		    "phone" : "AnyPhoneNumber",
		    "address" : "AnyAddress"
		}
		```	
	-	Delete a user (HTTP Method: DELETE) -> http://localhost:8080/SpringRestApiExample/user/2
			
			
	
		