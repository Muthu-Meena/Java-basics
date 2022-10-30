package Week3Day1Assignment;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Build a logic to find the given string is palindrome or not
	     
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */

		String S="madam";
		String rev=" ";
		
	
		for (int i=S.length()-1;i<0;i--)   {
			rev=rev+S.charAt(i);
		}
			if(S.equals(rev))	{
				System.out.println("This word is a Palindrome");
			}
			else {
				System.out.println("This word is not a Palindrome");
			}
		
		
		
		
		
		
		
	}
	}

