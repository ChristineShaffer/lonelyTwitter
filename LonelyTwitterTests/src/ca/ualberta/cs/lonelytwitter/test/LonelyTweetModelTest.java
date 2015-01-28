package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import android.test.ActivityInstrumentationTestCase2;

public class LonelyTweetModelTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public LonelyTweetModelTest() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	/*
	public void testSampleCode() {
		//assertFalse("This is not true", isGreaterEqual(7,6));
		//assertEquals("5 should be equal to 5",5,5);
		//assertTrue("This is not true", isGreateEqual(7,6));
		//fail("This is a failing test");
	}


	private boolean isGreateEqual(int i, int j) {
		if(i >= j)
			return true;
		
		return false;
	}
	*/
	
	
	// Lab 4 Tests for "equal" method
	public void testEquals() {
		NormalTweetModel normalTweet1 = new NormalTweetModel("Hi");
		NormalTweetModel normalTweet2 = new NormalTweetModel("Hi");
		assertTrue("Tweets shoul be equal", normalTweet1.equals(normalTweet2));
		
		NormalTweetModel normalTweet3 = new NormalTweetModel("Hello1");
		ImportantTweetModel importantTweet1 = new ImportantTweetModel("Hello1");
		assertFalse("Tweets shouldn't be equal", importantTweet1.equals(normalTweet3));
		
	}
	
}
