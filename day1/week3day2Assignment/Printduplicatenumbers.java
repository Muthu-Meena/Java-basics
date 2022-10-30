package week3day2Assignment;

import java.util.HashSet;
import java.util.Set;

public class Printduplicatenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]data = {4,3,6,8,29,1,2,4,7,8};
		for(int i=0;i<data.length;i++) {
			Set<Integer>duplicate=new HashSet<Integer>();
			for(int j=i+1;j<data.length;j++) {
				if(data[i]==data[j]) {
					duplicate.add(i);
					System.out.println("The duplicate values"  +duplicate);
				}
			}
			
			
			
			
		}
	}

}
