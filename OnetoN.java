import java.util.*;
public class OnetoN {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
      number(n);
    }
    public static void number(int n)
    {
        for(int i=1;i<=n;i++)
        {
        System.out.println(i);
        }
    }
}
