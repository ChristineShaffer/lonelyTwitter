package ca.ualberta.cs.lonelytwitter;

public class Author extends User {
	
	// Constructors
	public Author() {
		super();
		name = "anonymous_author";
	}
	
	// Constructor if name given
	public Author(String string) {
		super(string);
	}
	
	@Override
	public void setName(String x){
		name = x;
	}

}
