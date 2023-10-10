import java.util.*;            //JAVA PROGRAM TO CHECK Palindrome Number
class Palindrm             
{
	public static void main(String []MN)
	{
		int i,d,n,rev;
		Scanner gko=new Scanner(System.in);
	
	    System.out.print("Enter Any Number=");
		n=gko.nextInt();
		
		rev=0;
		for(i=n;i!=0;i=i/10)
		{
			d=i%10;
			rev=(rev*10)+d;
		}
		if(rev==n)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number Is Not Palindrome");
		}
	}
}