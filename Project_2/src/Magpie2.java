//Alex Zhou
//2nd period
//11-7-17

public class Magpie2 {

	//Get a default greeting and return a greeting	
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * takes in a user statement
	 * returns a response based on given rules
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) {
			response = "Tell me more about your family.";
		} else if(statement.indexOf("Mr") >=0
				|| statement.indexOf("Ms.") >= 0)
		{
			response = " He sounds like a good teacher. Tell me more about the teacher";
		}
		else if(statement.indexOf("Yes") >=0)
		{
			response = "Yeah dude! I agree.";
		}
		else if(statement.indexOf("girl") >=0)
		{
			response = "Oh, tell me more about that girl.";
		}
		else if(statement.indexOf("boy") >=0)
		{
			response = "Oh, tell me more about that boy.";
		}
		else if (statement.trim().length() == 0) {
			response = "Say something, please.";
		}
		else{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * returns a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		}
		else if (whichResponse == 4) {
			response = "No way! What happened after?";
		}
		else if (whichResponse == 5) {
			response = "You should go to sleep soon.";
		}

		return response;
	}
}


