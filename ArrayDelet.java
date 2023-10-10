import java.util.*;
public class ArrayDelet {
    public static void main(String[] args) {
        int size,i,pos;
        System.out.println("Enter array si:   ");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int arr[]=new int[size+1];
        System.out.println("Enter the array element:  ");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter array position:  ");
        pos=sc.nextInt();
        for(i=pos;i<size;i++)
        {
            arr[i]=arr[i+1];
        }
        size--;
        for(i=0;i<size;i++)
        {
            System.out.println(arr[i]+"  ");
        }
    }
}
 