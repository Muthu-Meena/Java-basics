package week3day2Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				// Here is the input
				//int[] data = {3,2,11,4,6,7,2,3,3,6,7};
				//       output= 7;

				/*
				 * Pseudo Code: 
				 * a) Create a empty Set Using TreeSet
				 * b) Declare for loop iterator from 0 to data.length and add into Set 
				 * c) converted Set into List
				 * d) Print the second last element from List
				 * 
				 * 
				 */

				Integer[]data= {3,2,11,4,6,7,2,3,3,6,7};
				TreeSet<Integer>data1=new TreeSet<Integer>();
				
				for(int i=0;i<data.length;i++)
					data1.add(data[i]);
				System.out.println(data);
				
				List<Integer>data2=new ArrayList<Integer>(data1);
				int size=data2.size();
				System.out.println("The Second largest number is"   +data2.get(size-2));
				
				
				
				
				

			}
	}


