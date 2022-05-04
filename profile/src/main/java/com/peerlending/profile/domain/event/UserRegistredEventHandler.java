package com.peerlending.profile.domain.event;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.peerlending.profile.domain.model.User;
import com.peerlending.profile.domain.repository.UserRepository;


@Component
public class UserRegistredEventHandler {
	
    private Logger LOGGER=LoggerFactory.getLogger(UserRegistredEventHandler.class);
    private static final Gson GSON=new Gson();
    private final UserRepository userRepo;
    @Autowired
    public UserRegistredEventHandler (UserRepository userRepo) {
    	this.userRepo= userRepo;
    }
    public void handelUserRegistration(String userDetails) {
    	User user=GSON.fromJson(userDetails, User.class);
    	LOGGER.info("user {} registred in profile",user.getUsername());
    	userRepo.save(user);
    }
    
}