package com.swagger.swaggerexample.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/rest/user")
@Api(value="User resources rest end point", description="Shows the User Info")
public class UserResources {

	@ApiOperation(value="Fetch all user details")
	@GetMapping
	public List<User> getUsers() {
		return Arrays.asList(
				new User("Sam", 200L),
				new User("John", 300L)
				);
	}

	@ApiOperation(value="Post user details")
	@PostMapping("/{userName}")
	public User postUser(@PathVariable final String userName ){
		return new User(userName, 1000L);
	}

}
