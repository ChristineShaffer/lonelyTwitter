package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetListModel {
	private int count;
	private ArrayList<LonelyTweetModel> tweetList;
	
	public TweetListModel() {
		count = 0;
		tweetList = new ArrayList<LonelyTweetModel>();
	}

	public int getCount() {
		return count;
	}

	public ArrayList<LonelyTweetModel> getTweet() {
		return tweetList;
	}

	// Write 4 functions: addTweet(LonelyTweetModel tweet) -- throws exception when tweet == another tweet
	//					  getTweets() -> LonelyTweetModel[]  (Ordered by timestamps)
	//				      hasTweet(LonelyTweetModelTweet) -> bool
	// 					  removeTweet(LonelyTweetModel tweet) -- if tweet == existing tweet then remove it
		
	public void addTweet(LonelyTweetModel tweet) {
		count++;
		tweetList.add(tweet);
	}
	

}
