import java.util.*;       //PROGRAM TO FIND FACTORIAL OF A NUMBER
class Facto
{
	public static void main(String MJ[])
	{
		int i,n,fct=1;         //fct=factorial
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter The Number To Find Factorial=");
		n=ob.nextInt();
		
		for(i=1;i<=n;i++)
		{
			fct=fct*i;
		}
		System.out.println("Factorial Is="+fct);
	}
}