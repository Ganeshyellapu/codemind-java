import java.util.*;
class pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=rows;j++)
            {
                if(j==i)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }
}