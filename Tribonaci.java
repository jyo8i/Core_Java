import java.util.*;
class Tribonaci      //TRIBONACI USING WHILE-LOOP
{
	public static void main(String MN[])
	{
		int i,num,n1,n2,n3,n4;
		
		Scanner mj=new Scanner(System.in);
		System.out.println("Enter Terms Number:");
		
		num=mj.nextInt();
		
		n1=0;
		n2=1;
		n3=2;
		i=0;
		System.out.println("TRIBONACI SERIES :::");
		while(i<=num)
		{
			n4=n1+n2+n3;
			System.out.print(" "+n1);
			n1=n2;
			n2=n3;
			n3=n4;
			i++;
		}
	}
}
	