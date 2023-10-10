import java.util.*;
class AlphaCheck
{
	public static void main(String MJ[])
	{
		char ch=0;
		Scanner ob=new Scanner(System.in);
		System.out.println("ENTER ANY ALPHABET TO CHECK WHETHER IT IS LOWERCASE OR UPPERCASE LETTER:::");
		 ch=ob.next().charAt(0);
		 
		 if(ch>=65 && ch<=90)
		 {
			 System.out.println("ENTERED ALPHABET IS IN UPPER-CASE:::");
		 }
		 else if(ch>=97 && ch<=122)
		 {
			 System.out.println("ENTERED ALPHABET IS IN LOWER-CASE:::");
		 }
		 else
		 {
			 System.out.println("ENTERED THE CORRECT SYMBOL:::");
		 }
	}
}