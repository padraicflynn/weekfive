package homeworkweek5;

 

public class App extends AsteriskLogger{

	public static void main(String[] args) {
		 
		Logger logger = new AsteriskLogger();
		
		logger.log("Hello");
		System.out.println();
		
		logger.error("Greetings!");
		System.out.println();
		
		logger.log("Stay warm this winter!");
		System.out.println();
		
		logger.error("Have a safe winter!");
			System.out.println();
			
			
		Logger secondlogger = new SpacedLogger();
		
		secondlogger.log("Hello again!");
		System.out.println();
		System.out.println();
		
		secondlogger.error("This text will have spaces!");
		System.out.println();
		System.out.println();
		
		secondlogger.log("Have a good winter!");
		System.out.println();
		System.out.println();
		
	secondlogger.error("And a happy new year!");
		
 
		
	
		
		
		
	}

}
