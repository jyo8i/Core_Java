//SWAP OF TWO NUMBERS USING XOR OPERATOR AND WITHOUT THIRD VARIABLE
import java.util.*;
class Swapxor
{
	public static void main(String MJ[])
	{
	  Scanner nm=new Scanner(System.in);
	  System.out.print("Enter the value of X=");
	  int x=nm.nextInt();
	  System.out.print("Enter the value of Y=");
	  int y=nm.nextInt();
	  System.out.println("Before Swap value of X="+ x+" "+"and value of Y="+ y);
	  
	  x=x^y;
	  y=x^y;
	  x=x^y;
	  
	  System.out.println("After Swap value of X="+ x+" "+"and value of Y="+ y);
	}
}