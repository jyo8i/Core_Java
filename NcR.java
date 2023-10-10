import java.util.*;
public class NcR {
    public static void main(String[] args) {
       int a,b;
       System.out.println("Enter the value");
       Scanner sc=new Scanner(System.in);
       a=sc.nextInt();
       b=sc.nextInt();
       int c=calculatesum(a,b);
       int multi=calculatemulti(a,b);
       System.out.println(c);
       System.out.println(multi);
    }
    public static int calculatesum(int a,int b)
    {
        int c=a+b;
        return c;
    }
    public static int calculatemulti(int a,int b)
    {
        int multi=a*b;
        return multi;
    }
   
}
