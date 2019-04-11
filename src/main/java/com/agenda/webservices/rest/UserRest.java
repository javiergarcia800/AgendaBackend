package com.agenda.webservices.rest;


import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.agenda.beans.UserBean;
import com.agenda.dto.User;


@Path("/user")
public class UserRest {

	private static final Logger LOG = LogManager.getLogger(UserRest.class);
	
	@Inject
	private UserBean userBean;
	
	@POST
	@Path("/validate")
	@Produces({"application/json"})
	public User validate() {
		User user = new User();
		user.setUsername("userJAXRS...");
		user.setPassword("passwordJAXRS...");
		LOG.debug("validate(" + user + ")...");
		userBean.validateUser(user.getUsername(), user.getPassword());
		return user;
	}
	
}
