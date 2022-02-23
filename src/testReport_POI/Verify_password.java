package testReport_POI;
import java.util.regex.*;

import freemarker.core.ReturnInstruction.Return;
import net.bytebuddy.implementation.bind.annotation.Empty;
public class Verify_password {

	public static boolean
	isValidPassword(String Passwod)
	{
		//regex check valid password 
		String regex= "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$"; 
                
		//compile the regex
                Pattern p = Pattern.compile(regex);
                // if pass is empty retun false 
                
                if(Passwod == null)
                {
                	return false;
                }
		 
             // Pattern class contains matcher() method 
                // to find matching between given password 
                // and regular expression. 
                
                Matcher m = p.matcher(Passwod);
                		
                // Return if the password 
                // matched the ReGex 
                return m.matches();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Reverse  string 
		String input = "jibhaoo";
	      char[] try1 = input.toCharArray();
	      for (int i = try1.length-1;i >= 0; i--)
	    	  System.out.println(try1[i]);
	      
		String str1 = "Jivan@1";
		System.out.println(isValidPassword(str1));
		
		String pass2 = "12345788";
		System.out.println(isValidPassword(pass2));
		
		String st2 ="jivan";
		System.out.println(isValidPassword(st2));
		
		String str45= "JIVAN4/lo#";
		System.out.println(isValidPassword(str45));
		
		
		
	}

}
