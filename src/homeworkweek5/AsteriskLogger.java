package homeworkweek5;

public class AsteriskLogger implements Logger{

	 
	
  
	//implemented method from logger
	
	public void log(String log) {
		 System.out.println("***" + log + "***");
		
	}
 
	
	//implemented method from logger
	
	
	
	public void error(String error) {
		
		 System.out.println("*************" + "*".repeat(error.length()));
		 System.out.println("***Error: " + error + "***");
		 System.out.println("*************" + "*".repeat(error.length()));
		
	}

}
