package ExceptionsCustom;

 class InvalidAgeException  extends Exception{
	
	public InvalidAgeException(String Str) {
		super(Str);
		 
		
	}}
public class test{
	static void  validate (int age) throws InvalidAgeException{
		 
		
	
	
		if (age <=18) {
			
		throw new InvalidAgeException("age is not valid to make a vote");
		}
		else {
			System.out.println("Elegible to  vote");
		}
	}
	   public static void main(String args[])  
	    {  
	        try  
	        {  
	            // calling the method   
	            validate(19);  
	        }  
	        catch (InvalidAgeException ex)  
	        {  
	            System.out.println("Caught the exception");  
	    
	            // printing the message from InvalidAgeException object  
	            System.out.println("Exception occured: " + ex);  
	        }  
	  
	        System.out.println("Suceess fully created custom Exception");    
	    }  
	}  