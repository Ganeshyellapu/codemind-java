import java.util.*;
class Winner
{
    public static void main(String args[])
    {
         int m,n;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        if(m%2==0 || n%2==0)
        {
            System.out.print("Player 1");
        }
        else
        {
            System.out.print("Player 2");
        }
    }
}
    
    
    
    
   