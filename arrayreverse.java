import java.util.*;
public class arrayreverse {
    public static void main(String[] args) {
        int arr[]=new int[5];
       Scanner r=new Scanner(System.in);
       System.out.println("Enter the array value");
       for(int i=0;i<arr.length;i++)
       {
        arr[i]=r.nextInt();
       } 
       System.out.print("Array elements");
       for(int i=0;i<arr.length;i++)
       {
        System.out.println(arr[i]+" ");
       }
       System.out.print("Reverse array");
       for(int i=arr.length-1;i>=0;i--)
       {
        System.out.print(arr[i]+" ");
       }
    }
}
