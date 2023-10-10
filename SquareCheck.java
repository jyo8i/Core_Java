import java.util.*;    //CHECKING WHETHER THE LENGTH AND BREADTH ARE OF A RECTANGLE OR A SQUARE.THUS FINDING THE AREA
class SquareCheck
{
	public static void main(String MJ[])
	{
		int l,b,ar;                         //l=length , b=breadth , ar=area
		Scanner ob=new Scanner(System.in);
		System.out.println("ENTER THE LENGTH AND BREADTH");
		
		l=ob.nextInt();
		b=ob.nextInt();
		
		if(l==b)
		{
			System.out.println("ENTERED VALUES ARE OF A SQUARE:::");
			ar=l*l;
			System.out.println("AREA OF THE SQUARE IS="+ar);
		}
		else
		{
			System.out.println("ENTERED VALUES ARE OF A RECTANGLE:::");
			ar=l*b;
			System.out.println("AREA OF THE RECTANGLE IS="+ar);
		}
	}
}