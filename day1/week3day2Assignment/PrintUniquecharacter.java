package week3day2Assignment;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.HashSet;
public class PrintUniquecharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	String name="Meena";
	char[]m=name.toCharArray();
	System.out.println(Arrays.toString(m));
	
	HashSet<Character>c=new HashSet<Character>();
	for(int i=0;i<m.length;i++) {
		c.add(m[i]);
	}
	for (int i=0;i<m.length;i++) {
		for (int j=i+1;j<m.length;j++) {
			
			if(m[i]==m[j]) {
				c.remove(m[i]);
				
				System.out.println("The unique characters are"      +c);
			}
		}
	
	}
		
	}


	}


