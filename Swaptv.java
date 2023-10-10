//SWAP OF TWO NUMBERS USING THIRD VARIABLE
import java.util.*;
class Swaptv
{
	public static void main(String arg[])
	{
		int x,y,temp;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the value of X=");
		x=ob.nextInt();
		System.out.println("Enter the Value of Y=");
		y=ob.nextInt();
		System.out.println("Before Swap value of X="+ x+" "+"and value of Y="+y);
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After Swap Value Of X="+ x+" "+"and value of Y="+y);
	}
}
		
		