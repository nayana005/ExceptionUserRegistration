package com.bridgelabz;

public class UserRegistration {

	private static final String firstNamePattern = "[A-Z]{1}[a-z]{3,}$";
	private static final String lastNamePattern = "^[A-Z]{1}[a-z]{3,}$";
	private static final String emailPattern = "[a-zA-Z0-9][a-zA-Z-0-9_+]*([.][a-zA-Z0-9]+)?[@][a-zA-Z-0-9]+[.][a-z.]{2,4}([.][a-zA-Z]{2,4})?";
	private static final String phoneNoPattern = "^[\\d]{2}\\s[\\d]{10}$";
	private static final String passwordPattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}";

	public boolean checkFirstName(String firstName) throws UserDetailsException{
		if(firstName.matches(firstNamePattern)) 
			System.out.println("First name is Valid");
		else
			throw new UserDetailsException("First name is InValid");
		return firstName.matches(firstName);
	}

	public boolean checkLastName(String lastName) throws UserDetailsException{
		if(lastName.matches(lastNamePattern))
			System.out.println("Last name is Valid");
		else
			throw new UserDetailsException("Last name is InValid");
		return lastName.matches(lastName);
	}

	public boolean checkEmail(String email) throws UserDetailsException{
		if(email.matches(emailPattern))
			System.out.println("Email is Valid");
		else
			throw new UserDetailsException("Email is InValid");
		return email.matches(email);
	}

	public boolean checkPhoneNo(String phoneNo) throws UserDetailsException{
		if(phoneNo.matches(phoneNoPattern))
			System.out.println("PhoneNo is Valid");
		else
			throw new UserDetailsException("PhoneNo is InValid");
		return phoneNo.matches(phoneNo);
	}

	public boolean checkPassword(String password) throws UserDetailsException{
		if(password.matches(passwordPattern))
			System.out.println("Password is Valid");
		else
			throw new UserDetailsException("Password is InValid");
		return password.matches(password);
	}
}


