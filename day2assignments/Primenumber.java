package day2assignments;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=6;
boolean flag=false;
for(int i=2;i<=n/2;i++)
{
	if(n% i==0)
	{
		flag=true;
	
	break;
}
}

if (flag)	
{
	System.out.println("the given number is not a prime number");
}else {
	System.out.println("the given number is a prime number");
}
}
	}
	

	


