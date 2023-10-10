public class coding {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        if(x++>10 && ++y>20)
        {
            System.out.println("inside if");
        }
        else
        {
            System.out.println("inside Else");
        }
        System.out.println(x+" "+y);
    }
}

