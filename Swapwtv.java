//SWAP OF TWO NUMBERS WITHOUT USING THIRD VARIABLE
import java.util.*;
class Swapwtv
{
	public static void main(String MJ[])
	{
	  Scanner nm=new Scanner(System.in);
	  System.out.print("Enter the value of X=");
	  int x=nm.nextInt();
	  System.out.print("Enter the value of Y=");
	  int y=nm.nextInt();
	  System.out.println("Before Swap value of X="+ x+" "+"and value of Y="+ y);
	  
	  x=x+y;
	  y=x-y;
	  x=x-y;
	  
	  System.out.println("After Swap value of X="+ x+" "+"and value of Y="+ y);
	}
}