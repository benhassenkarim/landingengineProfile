package com.peerlending.profile;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.peerlending.profile.domain.model.User;
import com.peerlending.profile.domain.repository.UserRepository;

@SpringBootApplication
public class ProfileApplication  implements CommandLineRunner{
	@Autowired
	private UserRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ProfileApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new User("jilani", "jilani", "abid", 26 , "dev", LocalDate.now()));
		
	}

}
