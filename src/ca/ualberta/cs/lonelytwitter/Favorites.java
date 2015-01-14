package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Favorites {
	
	private String FavoriteTweet;
	private Date Timestamp;
	
	// Getter
	public String getText() {
		return FavoriteTweet;
	}
	
	// Constructor
	public Favorites(String tweet) {
		super();
		FavoriteTweet = tweet;
		Timestamp = new Date();
	}
	
	public Date getTimestamp();
	
	
}
