import java.util.*;         //DISCOUNT GIVEN COST>1000
class TotalCost
{
	public static void main(String MJ[])
	{
		int q;                                  //q=Quantity
		double tc,pc;                          //tc=Total-Cost  , pc= per-unit-cost*quantity
		Scanner ob=new Scanner(System.in);
		System.out.println("ENTER AMOUNT OF QUANTITY TO BE PURCHESED:::");
		
		q=ob.nextInt();
		pc=q*100;
		
		if(pc>1000)
		{
			System.out.println("GOT! 10% DISCOUNT:::");
			tc=pc-(0.1*pc);
		}
		else
		{
		   tc=pc;
		   System.out.println("!NO DISCOUNT:::");
		}
		System.out.println("TOTAL COST OF THE PRODUCT IS="+tc);
	}
}
