package Week3Day1Assignment;

import java.util.Arrays;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */

		String text = "We learn java basics as part of java sessions in java week1";	
		int count=0;
		String replace="";
		String s="";		
		String[] split = text.split("");
		System.out.println(Arrays.toString(split));
		
		for(int i=0;i<=split.length;i++) {	

        for(int j=0;j<=split.length;j++) {
        	
        if(split[i].equals(split[j])){ 
	}
        }
		}
          
        count++;
        
        if(count>1) {
			 replace = text.replace("java", "");
		}
		 System.out.println("The duplicate word is "+s);
		 System.out.println(replace);
		
 
	}      
        
}


