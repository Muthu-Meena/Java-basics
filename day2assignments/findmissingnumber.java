package day2assignments;

import java.util.Arrays;

public class findmissingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]= {1,2,3,4,7,6,8};
		Arrays.sort(a1);
		for(int i=1;i<=a1.length;i++)
		{
			if(i!=a1[i-1]) {
				System.out.println(i);
				break;
			}
		}
	}
}
	

	


