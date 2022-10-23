import java.util.*;
class Phone_number
{
    public static void main(String args[])
    {
        String n;
        char a;
        int c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextLine();
        //a=sc.nextLine().charAt(0);
        c=n.length();
        if(c==10 )
        {
            System.out.print("Valid");
        }
        else
        {
            System.out.print("Invalid");
        }
    }
}