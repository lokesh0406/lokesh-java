package com.author.demo;

public class Author
{

private	String firstName;
private	String lastname;
	
	public Author(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastname=lastName;
	}

	public Author() {
	
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getLastname() {
		return lastname;
	}

	@Override
	public String toString() {
		return " [" + firstName + "  " + lastname + "]";
	}

	

	
	
	
	
}
