import java.util.*;
class pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                //if(j==1||j==i||i==rows)
                {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}