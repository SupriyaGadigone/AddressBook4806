package com.javasampleapproach.jqueryajax.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.jqueryajax.message.Response;
import com.javasampleapproach.jqueryajax.model.BuddyInfo;

/**
 * NOT MY WORK https://grokonez.com/java-integration/integrate-jquery-ajax-post-get-spring-boot-web-service
 */
@RestController
@RequestMapping("/api/customer")
public class RestWebController {

	List<BuddyInfo> budlist = new ArrayList<BuddyInfo>();

	@GetMapping(value = "/all")
	public Response getResource() {
		Response response = new Response("Done", budlist);
		return response;
	}

	@PostMapping(value = "/save")
	public Response postCustomer(@RequestBody BuddyInfo buddyInfo) {
		budlist.add(buddyInfo);
		
		// Create Response Object
		Response response = new Response("Done", buddyInfo);
		return response;
	}
}