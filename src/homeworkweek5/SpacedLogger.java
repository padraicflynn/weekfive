package homeworkweek5;

public class SpacedLogger implements Logger{

// convert string to character then printout each letter with a space
	public void log(String log) {
		 
		 char[] logChar = log.toCharArray();
		 
		 for (char c : logChar)
		 {
			 System.out.print(c);
			 System.out.print(" ");
		}
			} 
	
	// do the same but with error in front
	public void error(String error) {
		
		 System.out.print("Error: ");
		 char[] errorChar = error.toCharArray();
		 for (char f : errorChar)
		 {
			System.out.print(f);
			System.out.print(" ");
			 
		 }
		
	}

	 

	}


