package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class LonelyTweetModel {
	
	private String text;
	private Date timestamp;
	
	// Getter
	// Won't throw exception (b/c not declared above)
	public String getText() {
		return text;
	}
	
	public LonelyTweetModel(String text) {
		super();
		this.text = text;
		// Don't need to put "this.timestamp" b/c there's no argument called "timestamp", so automatically goes to the attributes
		timestamp = new Date();
	}
	
	public LonelyTweetModel(String text, Date timestamp) {
		super();
		this.text = text;
		this.timestamp = timestamp;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public abstract Date getTimestamp();
	
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
