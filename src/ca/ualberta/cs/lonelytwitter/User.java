package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public abstract class User extends Object implements UserLike {
	
	// Attribute
	protected String name;

	// Method definition
	public String getName() {
		return name;
	}
	
	// Method declaration
	// Must write setName method in everything that extends User
	public abstract void setName(String x) throws IOException;

	// Constructors
	public User(String name) {
		super();
		this.name = name;
	}
	
	public User() {
		super();
		this.name = "anonymous";
	}
	
}
