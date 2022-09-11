package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void checkFirstNameTest() throws UserDetailsException{
		Assert.assertTrue(userRegistration.checkFirstName("Nayana"));
		Assert.assertThrows(UserDetailsException.class, ()->userRegistration.checkFirstName("nAYana"));
	}

	@Test
	public void checkLastNameTest() throws UserDetailsException{
		Assert.assertTrue(userRegistration.checkLastName("Suresh"));
		Assert.assertThrows(UserDetailsException.class, ()->userRegistration.checkLastName("suREsh"));
	}

	@Test
	public void checkEmailTest() throws UserDetailsException{
		Assert.assertTrue(userRegistration.checkEmail("abc111@abc.com"));
		Assert.assertThrows(UserDetailsException.class, ()->userRegistration.checkEmail(".abc@abc.com"));
	}

	@Test
	public void checkPhoneNoTest() throws UserDetailsException{
		Assert.assertTrue(userRegistration.checkPhoneNo("91 9588201873"));
		Assert.assertThrows(UserDetailsException.class, ()->userRegistration.checkPhoneNo("213 456734248"));
	}

	@Test
	public void checkPasswordTest() throws UserDetailsException{
		Assert.assertTrue(userRegistration.checkPassword("Abc89@123"));
		Assert.assertThrows(UserDetailsException.class, ()->userRegistration.checkPassword("Abc"));
	}


}



