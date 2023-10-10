import java.util.*;
class NumWords
{
	public static void main(String MN[])
	{
		int num,i,dgt,d,rev=0;
		
		System.out.println("Enter Any Number:");
		Scanner mj=new Scanner(System.in);
		num=mj.nextInt();
		
		for(i=num;i!=0;i=i/10)
		{
			d=i%10;
		    rev=(rev*10)+d;
		}
		System.out.println("NUMBERS IN WORDS:::");
		for(i=rev;i!=0;i=i/10)
		{
			dgt=i%10;
			 switch(dgt)
			 {
				 case 0:System.out.print("ZERO-");
				 break;
				 case 1:System.out.print("ONE-");
				 break;
				 case 2:System.out.print("TWO-");
				 break;
				 case 3:System.out.print("THREE-");
				 break;
				 case 4:System.out.print("FOUR-");
				 break;
				 case 5:System.out.print("FIVE-");
				 break;
				 case 6:System.out.print("SIX-");
				 break;
				 case 7:System.out.print("SEVEN-");
				 break;
				 case 8:System.out.print("EIGHT-");
				 break;
				 case 9:System.out.print("NINE-");
				 break;
				 default:System.out.println("Sorry Bro");
			 }
		}
	}
}