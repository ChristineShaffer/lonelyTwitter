package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public class Reader extends User {
	
	private static Boolean enabled = false;
	
	// User's name must be less than or equal to 8 chars long
	// Must tell Java this method could throw an IOException
	public void setName(String x) throws IOException {
		if(x.length() > 8) {
			/*
			// Throws exception (we wrote try/catch in LonelyTwitterActivity -- if no handler in any methods then error)
			throw new RuntimeException("Name too long!");
			*/
			throw new IOException("Name too long!");
		}
		this.name = x;
	}
	
}
