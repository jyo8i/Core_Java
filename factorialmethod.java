import java.util.*;
public class factorialmethod {
    public static void main(String[] args) {
        int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
factorial(n);
    }
    public static void factorial(int n)
    {
        if(n<0)
        {
            System.out.println("Invalid");
            return;
        }
        int fact=1;
        for(int i=n;i>=1;i--)
        {
            fact=fact*i;
        
        }
        System.out.println(fact);
        return;
    }
}
