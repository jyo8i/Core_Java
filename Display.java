import java.util.*;
class Display
{
	public static void main(String MN[])
	{
		Scanner mj=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=mj.nextInt();
		
		System.out.println("Enter a Double Value:");
		double d=mj.nextDouble();
		
		System.out.println("Enter a String Value:");
		String s=mj.nextLine();
		
		System.out.println(":VALUES BELOW:");
		System.out.println(s);
		System.out.println(d);
		System.out.println(n);
	}
}