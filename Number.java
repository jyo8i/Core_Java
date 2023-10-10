import java.util.*;       //PROGRAM TO PRINT SERIES OF NUMBERS
class Number
{
	public static void main(String MJ[])
	{
		int in,fn,i;     		//in=inital number   , fn=final number
		Scanner nm=new Scanner(System.in);
		
		System.out.print("Enter The Inital Number=");
		in=nm.nextInt();
		System.out.print("Enter The Final Number=");
		fn=nm.nextInt();
		System.out.println("");
		for(i=in;i<=fn;i++)
		{
			System.out.println(" "+i);
		}
	}
}