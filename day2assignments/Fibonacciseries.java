package day2assignments;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int range=8;
int firstnum=0;
int secondnum=1;
System.out.println(firstnum+ ",");
System.out.println(secondnum);
for(int i=1;i<range-1;i++)
{
int sum=firstnum+secondnum;
firstnum=secondnum;
secondnum=sum;
System.out.print(","+sum );
}
	}

}
