package com.swagger.swaggerexample.resources;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/rest/hello")
@Api(value="Hello world Rest end point", description="Shows Hello world info")
public class HelloResources {


	@GetMapping
	@ApiOperation(value="Returns hello world")
	@ApiResponses(value= {
			@ApiResponse(code=100, message="100 is the message"),
			@ApiResponse(code=200, message="Success hello world")
	})
	public String hello() {
		return "Hello!";
	}

	@ApiOperation(value="Adds hello world")
	@PostMapping("/add")
	public String helloPost(@RequestBody final String request) {
		return "Added "+request;
	}

	@ApiOperation(value="Adds hello world")
	@PutMapping("/put")
	public String helloPut(@RequestBody final String request) {
		return request;
	}

	private void testJson(){
		JSONObject json = new JSONObject();
		json.put("name", "bhanu");
		json.put("age", 34);
		String s = JSONValue.toJSONString(json);

	}
}
