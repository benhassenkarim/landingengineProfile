package com.peerlending.profile.domain.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
private String username;
private String firstName;
private String lastName;
private int age;
private String occupation;
private LocalDate registredSince;
public User() {
	
}
public User(String username, String firstName, String lastName, int age, String occupation, LocalDate registredSince) {
	super();
	this.username = username;
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.occupation = occupation;
	this.registredSince = registredSince;
}

public void setRegistredSince(LocalDate registredSince) {
	this.registredSince = registredSince;
}
public String getUsername() {
	return username;
}
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public int getAge() {
	return age;
}
public String getOccupation() {
	return occupation;
}
public LocalDate getRegistredSince() {
	return registredSince;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + age;
	result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
	result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
	result = prime * result + ((occupation == null) ? 0 : occupation.hashCode());
	result = prime * result + ((registredSince == null) ? 0 : registredSince.hashCode());
	result = prime * result + ((username == null) ? 0 : username.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	if (age != other.age)
		return false;
	if (firstName == null) {
		if (other.firstName != null)
			return false;
	} else if (!firstName.equals(other.firstName))
		return false;
	if (lastName == null) {
		if (other.lastName != null)
			return false;
	} else if (!lastName.equals(other.lastName))
		return false;
	if (occupation == null) {
		if (other.occupation != null)
			return false;
	} else if (!occupation.equals(other.occupation))
		return false;
	if (registredSince == null) {
		if (other.registredSince != null)
			return false;
	} else if (!registredSince.equals(other.registredSince))
		return false;
	if (username == null) {
		if (other.username != null)
			return false;
	} else if (!username.equals(other.username))
		return false;
	return true;
}
@Override
public String toString() {
	return String.format("User [username=%s, firstName=%s, lastName=%s, age=%s, occupation=%s, registredSince=%s]",
			username, firstName, lastName, age, occupation, registredSince);
}


}
