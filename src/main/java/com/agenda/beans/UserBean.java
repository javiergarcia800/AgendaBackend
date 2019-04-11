package com.agenda.beans;

import javax.enterprise.context.ApplicationScoped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@ApplicationScoped
public class UserBean {

	private static final Logger LOG = LogManager.getLogger(UserBean.class);
	
	//EnityManager
	
	public UserBean() {
		
	}
	
	public boolean validateUser(String user, String password) {
		boolean valid = false;
		LOG.debug("validateUser(" + user + ", " + password + ")");
		
		
		LOG.debug("validateUser() return " + valid);
		return valid;
	}
	
}
